#include <iostream>
#include <string>

void task1(int* arr, int n) {
    int sum_p = 0, count_p = 0;
    int sum_n = 0, count_n = 0;
    int* p = arr;

    for (int i = 0; i < n; i++) {
        if (*p % 2 == 0) {
            sum_p += *p;
            count_p++;
        } else {
            sum_n += *p;
            count_n++;
        }
        p++;
    }

    if (count_p != 0) std::cout << "Avg even: " << (double)sum_p / count_p << std::endl;
    else std::cout << "No even numbers" << std::endl;
    
    if (count_n != 0) std::cout << "Avg odd: " << (double)sum_n / count_n << std::endl;
    else std::cout << "No odd numbers" << std::endl;
}

void task2(std::string* mas, int size) {
    std::string* p = mas;
    std::string* s_max = mas;
    std::string* s_min = mas;

    for (int i = 0; i < size; i++) {
        if (p->length() > s_max->length()) s_max = p;
        if (p->length() < s_min->length()) s_min = p;
        p++;
    }

    std::cout << "Max: " << *s_max << " (" << s_max->length() << ")" << std::endl;
    std::cout << "Min: " << *s_min << " (" << s_min->length() << ")" << std::endl;
}

void task3(double* mas, int n) {
    double s = 0;
    double* p = mas + (n - 1);

    std::cout << "Reverse: ";
    for (int i = 0; i < n; i++) {
        std::cout << *p << " ";
        s += *p;
        p--;
    }
    std::cout << "\nSum: " << s << std::endl;
}

int main() {
    int n1;
    std::cout << "Enter size: ";
    std::cin >> n1;
    int* a1 = new int[n1];
    for (int i = 0; i < n1; i++) {
        std::cin >> a1[i];
    }
    task1(a1, n1);
    delete[] a1;

    std::cout << "\n---" << std::endl;

    int n2;
    std::cout << "Enter size(strings): ";
    std::cin >> n2;
    std::string* a2 = new std::string[n2];
    for (int i = 0; i < n2; i++) {
        std::cout << "String " << i + 1 << ": ";
        std::cin >> a2[i];
    }
    task2(a2, n2);
    delete[] a2;

    std::cout << "\n---" << std::endl;

    int n3;
    std::cout << "Enter size(doubles): ";
    std::cin >> n3;
    double* a3 = new double[n3];
    for (int i = 0; i < n3; i++) {
        std::cin >> a3[i];
    }
    task3(a3, n3);
    delete[] a3;

    return 0;
}
