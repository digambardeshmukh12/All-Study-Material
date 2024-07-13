
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#define MAX_SIZE 100
struct stack {
    char items[MAX_SIZE];
    int top;
};
void init_stack(struct stack* s) {
    s->top = -1;
}
bool is_empty(struct stack* s) {
    return s->top == -1;
}
bool is_full(struct stack* s) {
    return s->top == MAX_SIZE - 1;
}
void push(struct stack* s, char value) {
    if (is_full(s)) {
        printf("Stack overflow.\n");
        exit(1);
    }
    s->top++;
    s->items[s->top] = value;
}
char pop(struct stack* s) {
    if (is_empty(s)) {
        printf("Stack underflow.\n");
        exit(1);
    }
    char value = s->items[s->top];
    s->top--;
    return value;
}
bool is_well_parenthesized(const char* expression) {
    struct stack s;
    init_stack(&s);
    for (int i = 0; i < strlen(expression); i++) {
        if (expression[i] == '(' || expression[i] == '[' || expression[i] == '{') {
            push(&s, expression[i]);
        } else if (expression[i] == ')' || expression[i] == ']' || expression[i] == '}') {
            if (is_empty(&s)) {
                return false;
            }
            char top = pop(&s);
            if ((expression[i] == ')' && top != '(') ||
                (expression[i] == ']' && top != '[') ||
                (expression[i] == '}' && top != '{')) {
                return false;
            }
        }
    }

    return is_empty(&s);
}
int main() {
    char expression[MAX_SIZE];
    printf("Enter an expression: ");
    scanf("%s", expression);
    if (is_well_parenthesized(expression)) {
        printf("The expression is well parenthesized.\n");
    } else {
        printf("The expression is not well parenthesized.\n");
    }
    return 0;
}
