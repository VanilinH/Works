#include <iostream>
#include <string>

void task1() {
    int n;
    std::cout << "Enter size: ";
    std::cin >> n;
    int* arr = new int[n];
    for (int i = 0; i < n; i++) {
        std::cin >> arr[i];
    }

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

    delete[] arr;
}

void task2() {
    int n;
    std::cout << "Enter size(strings): ";
    std::cin >> n;
    std::string* mas = new std::string[n];
    for (int i = 0; i < n; i++) {
        std::cout << "String " << i + 1 << ": ";
        std::cin >> mas[i];
    }

    std::string* p = mas;
    std::string* s_max = mas;
    std::string* s_min = mas;

    for (int i = 0; i < n; i++) {
        if (p->length() > s_max->length()) s_max = p;
        if (p->length() < s_min->length()) s_min = p;
        p++;
    }

    std::cout << "Max: " << *s_max << " (" << s_max->length() << ")" << std::endl;
    std::cout << "Min: " << *s_min << " (" << s_min->length() << ")" << std::endl;

    delete[] mas;
}

void task3() {
    int n;
    std::cout << "Enter size(doubles): ";
    std::cin >> n;
    double* mas = new double[n];
    for (int i = 0; i < n; i++) {
        std::cin >> mas[i];
    }

    double s = 0;
    double* p = mas + (n - 1);

    std::cout << "Reverse: ";
    for (int i = 0; i < n; i++) {
        std::cout << *p << " ";
        s += *p;
        p--;
    }
    std::cout << "\nSum: " << s << std::endl;

    delete[] mas;
}

int main() {
    int choice;
    do {
        std::cout << "\nMENU" << std::endl;
        std::cout << "1.Task 1 (Int pointers)" << std::endl;
        std::cout << "2.Task 2 (String pointers)" << std::endl;
        std::cout << "3.Task 3 (Double pointers reverse)" << std::endl;
        std::cout << "0.Exit" << std::endl;
        std::cout << "Choice: ";
        std::cin >> choice;

        if (choice == 1) task1();
        else if (choice == 2) task2();
        else if (choice == 3) task3();

    } while (choice != 0);

    return 0;
}