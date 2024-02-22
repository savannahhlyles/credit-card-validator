# Credit Card Validator

## Project Overview

This project includes a Java class named `CreditCard` designed to validate credit card numbers based on specific rules. The class provides methods to check the validity status of a credit card and retrieve an associated error code if applicable.

## Assignment Information

This project was created as part of an assignment to practice Object-Oriented Programming (OOP) principles. It is intended for educational purposes only and should not be used for validating actual credit cards in a real-world setting.

## Class Structure

The `CreditCard` class has the following instance variables:

- `private String cardNumber`: Stores the credit card number.
- `private boolean valid`: Indicates the validity status of the credit card.
- `private int errorCode`: Represents an error code associated with validation checks.

## Constructor

The class has a constructor that takes a credit card number as a parameter and initializes the instance variables.

## Validation Checks

The class includes several private helper methods (`check1()` to `check6()`) that perform specific validation checks based on the rules provided.

## Validation Method

The `check()` method is a mutator method that invokes all the helper methods to perform the complete validation of the credit card.

## Accessor Methods

- `isValid()`: Returns the validity status of the credit card.
- `getErrorCode()`: Returns the error code associated with the validation (if any).

## Usage

To use this class, create an instance of `CreditCard` with a credit card number, invoke the `check()` method to perform validation, and then use `isValid()` and `getErrorCode()` to retrieve the results.
