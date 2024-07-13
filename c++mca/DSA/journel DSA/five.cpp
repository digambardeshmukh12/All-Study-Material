#include <stdio.h> 

#include <stdlib.h> 

#include <string.h> 

#include <ctype.h> 

#define MAX_SIZE 100 

struct stack { 

    char items[MAX_SIZE]; 

    int top; 

}; 

void init_stack(struct stack* s) { 

    s->top = -1; 

} 

int is_empty(struct stack* s) { 

    return s->top == -1; 

} 

int is_full(struct stack* s) { 

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

int precedence(char op) { 

    if (op == '+' || op == '-') { 

        return 1; 

    } else if (op == '*' || op == '/') { 

        return 2; 

    } else if (op == '^') { 

        return 3; 

    } else { 

        return 0; 

    } 

} 

void infix_to_postfix(const char* infix, char* postfix) { 

    struct stack s; 

    init_stack(&s); 

    int j = 0; 

    for (int i = 0; infix[i] != '\0'; i++) { 

        char ch = infix[i]; 

        if (isdigit(ch) || isalpha(ch)) { 

            postfix[j] = ch; 

            j++; 

        } else if (ch == '(') { 

            push(&s, ch); 

        } else if (ch == ')') { 

            while (!is_empty(&s) && s.items[s.top] != '(') { 

                postfix[j] = pop(&s); 

                j++; 

            } 

            if (!is_empty(&s) && s.items[s.top] == '(') { 

                pop(&s); 

            } else { 

                printf("Invalid expression.\n"); 

                exit(1); 

            } 

        } else { 

            while (!is_empty(&s) && precedence(ch) <= precedence(s.items[s.top])) { 

                postfix[j] = pop(&s); 

                j++; 

            } 

            push(&s, ch); 

        } 

    } 

    while (!is_empty(&s)) { 

        postfix[j] = pop(&s); 

        j++; 

    } 

    postfix[j] = '\0'; 

} 

int main() { 

    char infix[MAX_SIZE]; 

    char postfix[MAX_SIZE]; 

  

    printf("Enter an infix expression: "); 

    fgets(infix, MAX_SIZE, stdin); 

    infix_to_postfix(infix, postfix); 

    printf("The postfix expression is: %s\n", postfix); 

    return 0; 

} 