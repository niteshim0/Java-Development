# How float and double gets stored in Memory ?(IEEE 754 Standard)

In Java, the `float` and `double` data types are used to store floating-point numbers. The `float` data type is a single-precision 32-bit IEEE 754 floating-point number, while the `double` data type is a double-precision 64-bit IEEE 754 floating-point number.

The IEEE 754 standard defines the format for representing floating-point numbers in binary. It specifies the number of bits used for the mantissa (fractional part), exponent, and sign of the number. The format for `float` and `double` numbers is as follows:

This will also clear the air on why it should not be used in real life applications where precision is required.It is capable of wasting almost millions of dollars.(You can search for the same on google or heard anything recently in news about the same.)

- **`float` (32 bits):**
  - Sign bit (1 bit)
  - Exponent (8 bits)
  - Mantissa (23 bits)

- **`double` (64 bits):**

  - Sign bit (1 bit)
  - Exponent (11 bits)
  - Mantissa (52 bits)

The sign bit represents the sign of the number (positive or negative). The exponent bits represent the power of 2 by which the mantissa is multiplied. The mantissa bits represent the fractional part of the number.

## We will understand the storage of float and double in memory with the help of an example:e.g. 4.125 f

### Step 1: Convert the number to binary

- **For float:**
  - The integer part of the number is 4, which is `100` in binary.
  - The fractional part of the number is 0.125, which is `001` in binary.
  - The binary representation of 4.125 is `100.001`.

- **For double:**

  - The integer part of the number is 4, which is `100` in binary.
  - The fractional part of the number is 0.125, which is `001` in binary.
  - The binary representation of 4.125 is `100.001`.

### Step 2: Normalize the binary representation

- **For float:**
  - Normalize the binary representation to `1.00001 x 2^2`.

- **For double:**
  - Normalize the binary representation to `1.00001 x 2^2`.


### Step 3: Calculate the exponent

- **For float:**
  - The exponent is 2, which is represented as `10000001` in binary (bias of 127).
  - The exponent bits are `10000010`.(bias of 127 + exponent value of 2)

- **For double:**
  - The exponent is 2, which is represented as `10000000000` in binary (bias of 1023).
  - The exponent bits are `10000000010`.

### Step 4: Calculate the mantissa

- **For float:**
  - The mantissa bits are `0000_1000_0000_0000_0000_000`.

- **For double:**
  - The mantissa bits are `0000_1000_0000_0000_0000_000_0000_0000_0000_000--upto 64 bits`.

### Step 5: Combine the sign, exponent, and mantissa

- **For float:**
  - The sign bit is `0` (positive number).
  - The exponent bits are `10000010`.
  - The mantissa bits are `0000_1000_0000_0000_0000_000`.
  - The binary representation of 4.125f is `0 10000010 0000_1000_0000_0000_0000_000`.

- **For double:**

  - The sign bit is `0` (positive number).
  - The exponent bits are `10000000010`.
  - The mantissa bits are `0000_1000_0000_0000_0000_000_0000_0000_0000_000`.
  - The binary representation of 4.125 is `0 10000000010 0000_1000_0000_0000_0000_000_0000_0000_0000_000`.

## Reverse Engineering this binary representation to get the original number

- **For float:**
  ```
  ((-1)^Sign)* (1+ Mantissa) * 2^(Exponent - Bias)
  ((-1)^0)* (1+ 0.03125) * 2^(129 - 127)
  1 * 1.03125 * 4
  4.125
  ```
- **For double:**
  ```
  ((-1)^Sign)* (1+ Mantissa) * 2^(Exponent - Bias)
  ((-1)^0)* (1+ 0.03125) * 2^(1025 - 1023)
  1 * 1.03125 * 4
  4.25
  ```

## Taking another example of 0.7f(It will show some descrepancies)

### Step 1: Convert the number to binary

- **For float:**
  - The integer part of the number is 0, which is `0` in binary.
  - The fractional part of the number is 0.7, which is `1011001100110011001100110011001100110011001100110011` in binary.
  - The binary representation of 0.7 is `0.1011001100110011001100110011001100110011001100110011`.

- **For double:**

  - The integer part of the number is 0, which is `0` in binary.
  - The fractional part of the number is 0.7, which is `1011001100110011001100110011001100110011001100110011` in binary.
  - The binary representation of 0.7 is `0.1011001100110011001100110011001100110011001100110011`.

### Step 2: Normalize the binary representation

- **For float:**
  - Normalize the binary representation to `1.01100110011001100110011 x 2^-1`.

- **For double:**
  - Normalize the binary representation to `1.01100110011001100110011 x 2^-1`.

### Step 3: Calculate the exponent

- **For float:**
  - The exponent is -1, which is represented as `01111110` in binary (bias of 127).
  - The exponent bits are `01111101`.(bias of 127 + exponent value of -1)

- **For double:**
  - The exponent is -1, which is represented as `01111111110` in binary (bias of 1023).
  - The exponent bits are `01111111101`.

### Step 4: Calculate the mantissa

- **For float:**
  - The mantissa bits are `0110_0110_0110_0110_0110_011`.

- **For double:**
  - The mantissa bits are `0110_0110_0110_0110_0110_011_0110_0110_0110_0110`.

### Step 5: Combine the sign, exponent, and mantissa

- **For float:**
  - The sign bit is `0` (positive number).
  - The exponent bits are `01111101`.
  - The mantissa bits are `0110_0110_0110_0110_0110_011`.
  - The binary representation of 0.7f is `0 01111101 0110_0110_0110_0110_0110_011`.

- **For double:**

  - The sign bit is `0` (positive number).
  - The exponent bits are `01111111101`.
  - The mantissa bits are `0110_0110_0110_0110_0110_011_0110_0110_0110_0110`.
  - The binary representation of 0.7 is `0 01111111101 0110_0110_0110_0110_0110_011_0110_0110_0110_0110`.

## Reverse Engineering this binary representation to get the original number

- **For float:**
  ```
  ((-1)^Sign)* (1+ Mantissa) * 2^(Exponent - Bias)
  ((-1)^0)* (1+ 0.699999988079071044921875) * 2^(126 - 127)
  1 * 1.39999997615814208984375 * 0.5
  0.699999988079071044921875
  ```
- **For double:**
  ```
  ((-1)^Sign)* (1+ Mantissa) * 2^(Exponent - Bias)
  ((-1)^0)* (1+ 0.699999988079071044921875) * 2^(1022 - 1023)
  1 * 1.39999997615814208984375 * 0.5
  0.699999988079071044921875 // This is not equal to 0.7 but we intended to store 0.7 that's why it is not recommended to use float and double in real life applications where precision is required.
  ```

## Conclusion

- The IEEE 754 standard defines the format for representing floating-point numbers in binary.
- The `float` data type is a single-precision 32-bit IEEE 754 floating-point number, while the `double` data type is a double-precision 64-bit IEEE 754 floating-point number.
- The binary representation of floating-point numbers involves the sign, exponent, and mantissa components.
- The precision of floating-point numbers is limited by the number of bits used for the mantissa and exponent.
- Floating-point numbers may not always have an exact binary representation due to the limitations of the IEEE 754 standard.
- It is important to be aware of the limitations of floating-point arithmetic when working with floating-point numbers in Java.







