#include <stdio.h>

void print_array(int array[], int size);
void abc(int data[], int out[], int size);

void print_array(int array[], int size){
    for (int i = 0; i < size; i++){
        printf(" %d",array[i]);
    }
    printf("\n");
}

void sort(int data[], int out[], int size){
    int count = 0;
    for (int i = 0; i < size; i++){
        for (int max_value = 0, j = 0; j < size; j++){
            if (data[j] >= max_value && data[j] >= 0){
                max_value = data[j];
                count = j;
            }
        }
        out[i] = data[count];
        data[count] = -1;
    }
}

int main(){
    const int SIZE = 6;
    int scores[SIZE] = {100, 60, 70, 100, 90, 80};
    int result[SIZE];

    printf ("sources =");
    print_array(scores, SIZE);

    sort(scores, result, SIZE);

    printf ("results =");
    print_array(result, SIZE);

    return 0;
}
