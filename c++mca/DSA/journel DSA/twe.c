#include <stdio.h> 

#include <stdlib.h> 

#define MAX 100 

typedef struct Edge { 

    int u, v, weight; 

} Edge; 

typedef struct Graph { 

    int V, E; 

    Edge edges[MAX]; 

} Graph; 

typedef struct Subset { 

    int parent, rank; 

} Subset; 

int find(Subset subsets[], int i); 

void union_(Subset subsets[], int x, int y); 

int compare(const void* a, const void* b); 

void kruskal(Graph graph);int main() { 

    Graph graph; 

    printf("Enter the number of vertices in the graph: "); 

    scanf("%d", &graph.V); 

    printf("Enter the number of edges in the graph: "); 

    scanf("%d", &graph.E); 

    printf("Enter the edges in the format (u, v, weight):\n"); 

    for (int i = 0; i < graph.E; i++) { 

        scanf("%d %d %d", &graph.edges[i].u, &graph.edges[i].v, &graph.edges[i].weight); 

    } 

    kruskal(graph); 

    return 0; 

} 

int find(Subset subsets[], int i) { 

    if (subsets[i].parent != i) { 

        subsets[i].parent = find(subsets, subsets[i].parent); 

    } 

    return subsets[i].parent; 

} 

void union_(Subset subsets[], int x, int y) { 

    int xroot = find(subsets, x); 

    int yroot = find(subsets, y); 

    if (subsets[xroot].rank < subsets[yroot].rank) { 

        subsets[xroot].parent = yroot; 

    } else if (subsets[xroot].rank > subsets[yroot].rank) { 

        subsets[yroot].parent = xroot; 

    } else { 

        subsets[yroot].parent = xroot; 

        subsets[xroot].rank++; 

    } 

} 

int compare(const void* a, const void* b) { 

    Edge* edge1 = (Edge*)a; 

    Edge* edge2 = (Edge*)b; 

    return edge1->weight - edge2->weight; 

} 

void kruskal(Graph graph) { 

    Edge result[MAX]; 

    int e = 0; // index of next edge to be added to result 

    int i = 0; // index of next edge to be considered 

    Subset subsets[MAX]; 

    qsort(graph.edges, graph.E, sizeof(graph.edges[0]), compare); 

    for (int v = 0; v < graph.V; v++) { 

        subsets[v].parent = v; 

        subsets[v].rank = 0; 

    } 

    while (e < graph.V - 1 && i < graph.E) { 

        Edge next_edge = graph.edges[i++]; 

        int x = find(subsets, next_edge.u); 

        int y = find(subsets, next_edge.v); 

        if (x != y) { 

            result[e++] = next_edge; 

            union_(subsets, x, y); 

        } 

    } 

    printf("Edges in the minimum cost spanning tree:\n"); 

    for (int j = 0; j < e; j++) { 

        printf("(%d, %d) -> %d\n", result[j].u, result[j].v, result[j].weight); 

    } 

} 

  