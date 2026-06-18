// Copyright
// Estrutura de Dados
// URI Santiago
// Professor Laurence

#include <iostream>
#include <list>
#include <string>

template <typename tree_node_type>
struct tree_node {
  tree_node<tree_node_type> *parent;
  std::list<tree_node<tree_node_type> *> childs;
  tree_node_type data;

  tree_node(tree_node *parent, tree_node_type data) {
    this->parent = parent;
    this->data = data;
  }
};
template <typename tree_type>
class tree {
 public:
  tree(tree_type root_data) : tree_root(nullptr, root_data) {}

  void add(tree_type parent_data, tree_type data) {

    tree_node<tree_type>* parent_node = findNode(&tree_root, parent_data);

    if(parent_node == nullptr) {
        std::cout << "Pai nao encontrado" << std::endl;
        return;
    }

    tree_node<tree_type>* new_node = new tree_node<tree_type>(parent_node, data);

    parent_node->childs.push_back(new_node);
}

  void remove(tree_type data) {
    tree_node<tree_type> *actual_node = findNode(&tree_root, data); 
    if(actual_node == nullptr) {
      std::cout << "Alvo nao encontrado" << std::endl;
      return;
    }

    tree_node<tree_type> *parent_node = actual_node->parent;

    parent_node->childs.remove(actual_node); //Falta remover a subarvore do nó removido

  }

  std::list<tree_type> path_values(tree_type data) {

    std::list<tree_type> path;

    tree_node<tree_type>* actual_node = findNode(&tree_root, data);

    while(actual_node != nullptr) {

        path.push_front(actual_node->data);

        actual_node = actual_node->parent;
    }

    return path;
}

  std::list<tree_type> sub_tree_values(tree_type data) {

    std::list<tree_type> values;

    tree_node<tree_type>* actual_node = findNode(&tree_root, data);

    if(actual_node == nullptr) {
        return values;
    }

    addlist(actual_node, &values);

    return values;
}

  std::list<tree_type> values() {

    std::list<tree_type> print_values;

    addlist(&tree_root, &print_values);

    return print_values;
  }

  void addlist(tree_node<tree_type>* current_node, std::list<tree_type>* list) {

    list->push_back(current_node->data);

    for(tree_node<tree_type>* child : current_node->childs) {

        addlist(child, list);
    }
  }
  

  tree_node<tree_type>* findNode(tree_node<tree_type>* current_node, tree_type data) {

    if (current_node->data == data) {
        return current_node;
    }

    for (tree_node<tree_type>* child : current_node->childs) {

        tree_node<tree_type>* result = findNode(child, data);

        if (result != nullptr) {
            return result;
        }
    }

    return nullptr;
  }

 private:
  // TODO

  tree_node<tree_type> tree_root;
};

int main() {
  tree<std::string> beverages_tree("Bebida");

  beverages_tree.add("Bebida", "Refrigerante");
  beverages_tree.add("Bebida", "Vinho");
  beverages_tree.add("Bebida", "Cerveja");
  beverages_tree.add("Refrigerante", "Coca");
  beverages_tree.add("Refrigerante", "Pepsi");
  beverages_tree.add("Refrigerante", "Guaraná");
  beverages_tree.add("Vinho", "Tinto");
  beverages_tree.add("Cerveja", "Pilsen");
  beverages_tree.add("Cerveja", "Weiss");
  beverages_tree.add("Tinto", "Pinot");
  beverages_tree.add("Tinto", "Malbec");
  beverages_tree.add("Tinto", "Merlot");
  beverages_tree.add("Malbec", "Francês");
  beverages_tree.add("Malbec", "Argentino");

  std::cout << "Cervejas:" << std::endl;
  for (std::string sub_tree_item : beverages_tree.sub_tree_values("Cerveja")) {
    std::cout << sub_tree_item << " ";
  }
  std::cout << std::endl << std::endl;

  beverages_tree.add("Vinho", "Champanhe");

  beverages_tree.remove("Merlot");

  beverages_tree.remove("Refrigerante");

  for (std::string beverage : beverages_tree.values()) {
    for (std::string path_value : beverages_tree.path_values(beverage)) {
      std::cout << path_value << ">";
    }
    std::cout << std::endl;
  }
}
