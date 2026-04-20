 // ПЕРВОЕ ЗАДАНИЕ
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    srand(time(NULL));
    int mas[10];
    int a = 0;
    int b = 0;

    for (int i = 0; i < 10; i++) {
        mas[i] = rand() % 100;
        printf("%d ", mas[i]);
        
        if (mas[i] % 2 == 0) {
            a++;
        } else {
            b++;
        }
    }

    printf("\npair: %d\n", a);
    printf("odd: %d\n", b);

    return 0;
}

 // ВТОРОЕ ЗАДАНИЕ
#include <stdio.h>

int main() {
    int n;
    printf("n: \n");
    scanf("%d", &n);

    double mas[50];
    double s = 0;

    for (int i = 0; i < n; i++) {
        printf("Angle %d: \n", i + 1);
        scanf("%lf", &mas[i]);
        s = s + mas[i];
    }

    if (s == 180 * (n - 2)) {
        printf("This figure exist\n");
    } else {
        printf("This figure cannot exist\n");
    }

    return 0;
}

 // ТРЕТИЕ ЗАДАНИЕ
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    srand(time(NULL));
    int n, v1, v2;
    printf("Enter size: \n");
    scanf("%d", &n);

    int a[100];
    for (int i = 0; i < n; i++) {
        a[i] = rand() % 30;
        printf("%d ", a[i]);
    }

    printf("\nNumber to change: \n");
    scanf("%d", &v1);
    printf("New number: \n");
    scanf("%d", &v2);

    for (int i = 0; i < n; i++) {
        if (a[i] == v1) {
            a[i] = v2;
        }
    }

    for (int i = 0; i < n; i++) {
        printf("%d ", a[i]);
    }
    printf("\n");

    return 0;
}

 // ЧЕТВЕРТЕ ЗАВДАННЯ
#include <stdio.h>
#include <math.h>

int main() {
    int k = 0;
    for (int i = 0; i <= 90; i++) {
        double res = sin(i * 3.1415 / 180);
        printf("%.4f ", res);
        k++;

        if (k == 10) {
            printf("\n");
            k = 0;
        }
    }
    return 0;
}

 // ПЯТОЕ ЗАДАНИЕ
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    srand(time(NULL));
    int n, t;
    printf("Size: \n");
    scanf("%d", &n);

    int m[100];
    for (int i = 0; i < n; i++) {
        m[i] = rand() % 100;
        printf("%d ", m[i]);
    }

    printf("\n1-up, 2-down: \n");
    scanf("%d", &t);

    int ok = 1;
    for (int i = 0; i < n - 1; i++) {
        if (t == 1 && m[i] > m[i+1]) {
            ok = 0;
        }
        if (t == 2 && m[i] < m[i+1]) {
            ok = 0;
        }
    }

    if (ok == 1) {
        printf("True\n");
    } else {
        printf("False\n");
    }

    return 0;
}
