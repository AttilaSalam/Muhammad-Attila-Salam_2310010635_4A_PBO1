
# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pendataan pendaki gunung menggunakan Java sebagai tugas akhir dari mata kuliah **Pemrograman Berbasis Objek 1**.

## Deskripsi

Aplikasi ini menerima input berupa nama dan asal pendaki, serta tipe gunung yang ingin didaki (mudah atau sulit). Berdasarkan input tersebut, aplikasi akan menampilkan informasi detail tentang gunung dan perjalanan pendakian.

Aplikasi ini mengimplementasikan berbagai konsep OOP (Object Oriented Programming), di antaranya:

- Class dan Object
- Atribut dan Method
- Constructor, Mutator, dan Accessor
- Encapsulation
- Inheritance
- Overriding
- Seleksi
- Perulangan
- IO Sederhana
- Array
- Error Handling

## Penjelasan Kode

Berikut adalah bagian-bagian kode yang menunjukkan implementasi konsep OOP:

### 1. Class
Blueprint dari objek. Contoh class pada program ini:

```java
public class Pendaki { ... }

public class Gunung { ... }

public class GunungMudah extends Gunung { ... }

public class GunungSulit extends Gunung { ... }

public class Perjalanan { ... }

public class Main { ... }
```

### 2. Object
Contoh pembuatan object:

```java
Pendaki p = new Pendaki(nama, asal);
Gunung g = new GunungMudah(); // atau GunungSulit
Perjalanan pj = new Perjalanan(p, g);
```

### 3. Atribut
Contoh atribut:

```java
private String nama;
private String asal;
private String namaGunung;
private int ketinggian;
```

### 4. Constructor
Method yang dipanggil saat objek dibuat:

```java
public Pendaki(String nama, String asal) { ... }

public GunungMudah() {
    super("Gunung Halau-halau", 1901);
}
```

### 5. Mutator (Setter)
Digunakan untuk mengatur nilai atribut:

```java
public void setNama(String nama) { this.nama = nama; }
```

### 6. Accessor (Getter)
Digunakan untuk mengambil nilai atribut:

```java
public String getNama() { return nama; }
```

### 7. Encapsulation
Atribut dibuat `private` dan diakses lewat getter/setter:

```java
private String nama;

public String getNama() { return nama; }
public void setNama(String nama) { this.nama = nama; }
```

### 8. Inheritance
`GunungMudah` dan `GunungSulit` mewarisi class `Gunung`:

```java
public class GunungMudah extends Gunung { ... }
```

### 9. Polymorphism (Overriding)
Method `deskripsi()` di-override oleh subclass:

```java
@Override
public String deskripsi() {
    return "Gunung dengan jalur yang relatif mudah.";
}
```

### 10. Seleksi
Menggunakan `if-else` untuk memilih jenis gunung:

```java
if (tipe.equalsIgnoreCase("mudah")) {
    gunung = new GunungMudah();
} else {
    gunung = new GunungSulit();
}
```

### 11. Perulangan
Untuk input dan output data pendaki:

```java
for (int i = 0; i < jumlah; i++) {
    ...
}
```

### 12. IO Sederhana
Input menggunakan `Scanner`, output menggunakan `System.out`:

```java
Scanner input = new Scanner(System.in);
System.out.print("Masukkan nama pendaki: ");
```

### 13. Array
Menyimpan banyak object `Perjalanan`:

```java
Perjalanan[] perjalanan = new Perjalanan[jumlah];
```

### 14. Error Handling
Menggunakan `try-catch` untuk menangani input:

```java
try {
    jumlah = input.nextInt();
} catch (Exception e) {
    System.out.println("Input harus berupa angka.");
}
```

## Usulan Nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

**Nama**: Muhammad Attila Salam
**NPM**: 2310010635
