# ECDSA-Algorithm

The **Elliptic Curve Digital Signature Algorithm (ECDSA)** consists of two modules: 
- A signing algorithm 
- A verification algorithm

A person who wants to sign a message digitally uses the signing algorithm, which first creates a message digest (hash) of the message using a suitable hash function (e.g. SHA-1) and then the message digest is encrypted using the signer’s private key. The encrypted message digest is the 'Digital Signature' of the sender on that message.

Anyone can verify whether that 'Digital Signature' is authentic or not by using verification algorithm. At first a message digest of the signer's message is created using the identical hash function (e.g. SHA-1). The verifier then decrypts the ciphered hash output using the signer's public key. If the ciphered hash output and the message digest created by the verifier are found to be identical, the signer's authenticity is proved.

In this project, a java application program has been written in which the ECDSA functionality of both signing and verification is provided using a NIST recommended elliptic curve over prime fields (Curve P-192). This application program can be used for signing and verification of an electronic ASCII document.

### NIST-recommended elliptic curve (Curve P-192) over prime field:
```
p = 2^192-2^64-1 , a = −3, h = 1
S = 0x 3045AE6F C8422F64 ED579528 D38120EA E12196D5
r = 0x 3099D2BB BFCB2538 542DCD5F B078B6EF 5F3D6FE2 C745DE65
b = 0x 64210519 E59C80E7 0FA7E9AB 72243049 FEB8DEEC C146B9B1
n = 0x FFFFFFFF FFFFFFFF FFFFFFFF 99DEF836 146BC9B1 B4D22831
x = 0x 188DA80E B03090F6 7CBF20EB 43A18800 F4FF0AFD 82FF1012
y = 0x 07192B95 FFC8DA78 631011ED 6B24CDD5 73F977A1 1E794811
```

### Reference
Johnson, D., Menezes, A. and Vanstone, S., 2001. "The elliptic curve digital signature algorithm (ECDSA)".  International journal of information security, 1(1), pp. 36-63.

Link: <http://residentrf.ucoz.ru/_ld/0/34_Digital_Signatu.pdf>
