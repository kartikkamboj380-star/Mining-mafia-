package I1;

import java.io.File;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static File a(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static long b(String str, String str2) {
        File fileA = a(str, str2);
        if (fileA.exists()) {
            return fileA.length();
        }
        File fileD = d(str, str2);
        if (fileD.exists()) {
            return fileD.length();
        }
        return 0L;
    }

    public static void c(RandomAccessFile randomAccessFile, byte[] bArr, int i10, int i11, String str) {
        try {
            randomAccessFile.seek(i10);
            randomAccessFile.write(bArr, 0, i11);
        } catch (Throwable unused) {
        }
    }

    public static File d(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2 + ".temp");
    }
}
