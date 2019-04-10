/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverLicenseApp;

/**
 * A utility class to verify that person  
 * meet certain criteria with respect
 * to their age for applying for Driver License
 * @author mehta
 */
public class driverLicenseAgeValidator {
     /**
     * A method that validates that persons are eligible for applying for Learner's permit (G1) or not
     * @param personAge, the person's age
     * @return true if the person is 16 or more years old, false otherwise. 
     */
    public boolean validateAge(int personAge)
    {
        if(personAge>=16)
        {
            return true;
        }
        return false;
    }
}
