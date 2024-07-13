#include <stdio.h> 

#include <stdlib.h> 

#define MAX_VERTICES 100 

// Structure for a linked list node 

typedef struct node { 

    int dest; 

    struct node *next; 

} Node; 

// Structure for a graph 

typedef struct graph { 

    int V; 

    Node **adjList; 

} Graph; 

// Function to create a new node for the adjacency list 

Node* createNode(int dest) { 

    Node *newNode = (Node*) malloc(sizeof(Node)); 

    newNode->dest = dest; 

    newNode->next = NULL; 

    return newNode; 

} 

// Function to create a new graph with V vertices 

Graph* createGraph(int V) { 

    Graph *graph = (Graph*) malloc(sizeof(Graph)); 

    graph->V = V; 

    graph->adjList = (Node**) malloc(V * sizeof(Node*)); 

    for (int i = 0; i < V; i++) { 

        graph->adjList[i] = NULL; 

    } 

    return graph; 

} 

// Function to add an edge to an undirected graph 

void addEdge(Graph *graph, int src, int dest) { 

    Node *newNode = createNode(dest); 

    newNode->next = graph->adjList[src]; 

    graph->adjList[src] = newNode; 

    newNode = createNode(src); 

    newNode->next = graph->adjList[dest]; 

    graph->adjList[dest] = newNode; 

} 

// Function to perform Depth First Search 

void DFS(Graph *graph, int vertex, int visited[]) { 

    visited[vertex] = 1; 

    printf("%d ", vertex); 

    Node *adjNode = graph->adjList[vertex]; 

    while (adjNode != NULL) { 

        int adjVertex = adjNode->dest; 

        if (!visited[adjVertex]) { 

            DFS(graph, adjVertex, visited); 

        } 

        adjNode = adjNode->next; 

    } 

} 

int main() { 

    int V, E; 

    printf("Enter the number of vertices: "); 

    scanf("%d", &V); 

    Graph *graph = createGraph(V); 

    printf("Enter the number of edges: "); 

    scanf("%d", &E); 

    for (int i = 0; i < E; i++) { 

        int src, dest; 

        printf("Enter edge %d: ", i+1); 

        scanf("%d %d", &src, &dest); 

        addEdge(graph, src, dest); 

    } 

    printf("Depth First Traversal order: "); 

    int visited[MAX_VERTICES] = {0}; 

    for (int i = 0; i < V; i++) { 

        if (!visited[i]) { 

            DFS(graph, i, visited); 

        } 

    } 

    return 0; 

} 