 # include <iostream>
 using namespace std;

 int day, month, year, error = 0;
 int days[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

 bool leap(int yy) {
 	if (yy%4 == 0) {
 		return true;
 	} else {
 		return false;
 	}
 }

 bool endMonth(int mm) {
 	if (mm == 12) {
 		return true;
 	} else {
 		return false;
 	}
 }

 int checkDay(int dd, int mm) {
 	if (dd > days[mm-1] || dd < 1) {
 		return -1;
 	} else {
 		return dd;
 	}
 }

 void checkInput(int dd, int mm, int year) {
 	int dayCheck = checkDay(day, month);
    if (dayCheck == -1) {
        error = 1;
        cout << "\n\tInvalid Date.\n";
    } else {
        error = 0;
    	cout << "\n\tCurrent Date : " << day << "/" << month << "/" <<  year << endl;
    }
 }

 int main() {
 	int d_err=0, m_err=0, y_err=0;
    do {
    	do {
    		cout << "\n\tEnter Day :> ";	cin >> day;
    		if (day < 1 || day > 31) {
    			d_err = 1;
    			cout << "\t//*** Please enter a valid day. ***//\n";
    		} else {
    			d_err = 0;
    		}
    	} while (d_err == 1);

    	do {
    		cout << "\tEnter Month :> ";	cin >> month;
    		if (month < 1 || month > 12) {
    			m_err = 1;
    			cout << "\t//*** Please enter a valid month. ***//\n";
    		} else {
    			m_err = 0;
    		}
    	} while (m_err == 1);

    	do {
    		cout << "\tEnter Year :> ";	cin >> year;
    		if (year < 1 || year > 2030) {
    			y_err = 1;
    			cout << "\t//*** Please enter a valid year. ***//\n";
    		} else {
    			y_err = 0;
    		}
    	} while (y_err == 1);

        if (leap(year)) {
            days[1] = 29;
        } else {
            days[1] = 28;
        }
        checkInput(day, month, year);

    } while (error == 1);

 	return 0;
 }
