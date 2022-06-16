package w05;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;

public class RSA {
    public static void main(String[] args) {
        KeyPair keyPair = getKeyPair();

        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        System.out.println(publicKey.toString());
        System.out.println(privateKey.toString());

        String plaintext = "My love letter";

        String ciphertext = encrypt(plaintext, publicKey);

        System.out.println(ciphertext);

        String actualPlaintext = decrypt(ciphertext, privateKey);

        System.out.println(actualPlaintext);

//        actualPlaintext = decryptWithPublicKey(ciphertext, publicKey);
//
//        System.out.println(actualPlaintext);
    }

    private static KeyPair getKeyPair() {
        try {
            KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");

            generator.initialize(2048, new SecureRandom());
            KeyPair pair = generator.generateKeyPair();

            return pair;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private static String encrypt(String plaintext, PublicKey publicKey) {
        try {
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);

            byte[] bytes = plaintext.getBytes(StandardCharsets.UTF_8);

            byte[] ciphertext = cipher.doFinal(bytes);

            return Base64.getEncoder()
                    .encodeToString(ciphertext);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private static String decrypt(String ciphertext, PrivateKey privateKey) {
        try {
            byte[] bytes = Base64.getDecoder()
                    .decode(ciphertext);

            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, privateKey);

            byte[] plaintext = cipher.doFinal(bytes);

            return new String(plaintext, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private static String decryptWithPublicKey(String encryptedMessage, PublicKey publicKey) {
        try {
            byte[] bytes = Base64.getDecoder().decode(encryptedMessage);

            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, publicKey);

            byte[] plaintext = cipher.doFinal(bytes);

            return new String(plaintext, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
