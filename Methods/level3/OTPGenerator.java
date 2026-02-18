package com.gla.Methods.level3;

public class OTPGenerator {
    // a. Method to generate 6-digit OTP
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    // c. Method to check uniqueness
    public static boolean areOTPsUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] otpArray = new int[10];

        // b. Generate OTP 10 times
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        System.out.println("Are all OTPs unique? " +
                areOTPsUnique(otpArray));
    }
}
