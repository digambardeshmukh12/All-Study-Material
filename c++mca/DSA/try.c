#include <stdio.h> 

#include <limits.h> 

int main() { 

    int n; 

    printf("Enter the number of students: "); 

    scanf("%d", &n);     

    int marks[n]; 

    int sum = 0; 

    int highest = INT_MIN; 

    int lowest = INT_MAX;     

    for (int i = 0; i < n; i++) { 

        printf("Enter marks for student %d: ", i+1); 

        scanf("%d", &marks[i]); 

        sum += marks[i]; 

        if (marks[i] > highest) { 

            highest = marks[i]; 

        } 

        if (marks[i] < lowest) { 

            lowest = marks[i]; 

        } 

    } 

     

    float average = (float) sum / n;     

    printf("Average score: %f\n", average); 

    printf("Highest score: %d\n", highest); 

    printf("Lowest score: %d\n", lowest);     

    return 0; 

} 