package org.openmrs.module.referenceapplication.identifier;

import org.openmrs.patient.IdentifierValidator;
import org.openmrs.patient.UnallowedIdentifierException;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Validate the NIN
 * <p>
 * <ol>
 * <li>NIN format  for Ghana National Health CM131521234X</li>
 * </ol>
 * <p>
 * <p>
 */
 public class  NINIdentifierValidator implements IdentifierValidator{

      public String getName() {
          return "National ID validator for validation";
      }

       /**
     * @param identifier The Identifier to check.
     * @return Whether this identifier is valid according to the validator.
     * @throws UnallowedIdentifierException if the identifier contains unallowed characters or is
     *                                      otherwise not appropriate for this validator.
     */
      public boolean isValid(String identifier) throws UnallowedIdentifierException {
    //    checking the Nin first Number
        String exp_regex = "^$|^[A-Z][FM]\\d{5}([A-Z0-9]){7}$";
        Pattern pattern = Pattern.compile(exp_regex);//this class compiles expressed regex pattern
        // lets now match the partner
        Matcher matcher = pattern.matcher(identifier);
        return matcher.matches();//this return matched partener in defined regural experression

      }
    /**
     * @param validIdentifier The identifier prior to being given a check digit or other form
     *                        of validation.
     * @return The identifier after the check digit or other form of validation has been applied.
     * @throws UnallowedIdentifierException if the identifier contains unallowed characters or is
     *                                      otherwise not appropriate for this validator.
     */
      public String   getValidIdentifier(String ValidIdentifier) throws UnallowedIdentifierException{
          if(ValidIdentifier!= null){
              ValidIdentifier = ValidIdentifier.toUpperCase().trim();  
          }
          return ValidIdentifier;
        } 
    /**
     * @return A string containing all the characters allowed in this type of identifier validation.
     */
    public String getAllowedCharacters() {
        return "0123456789ABCDEFGHIJKLMNOPQRSTUVWYZ";
    }
}