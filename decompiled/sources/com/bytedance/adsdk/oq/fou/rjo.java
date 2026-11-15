package com.bytedance.adsdk.oq.fou;

import android.util.Pair;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class rjo {
    private final csi kq;

    public rjo(csi csiVar) {
        this.kq = csiVar;
    }

    private File oq(String str) {
        File file = new File(kq(), kq(str, bob.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(kq(), kq(str, bob.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    Pair<bob, InputStream> kq(String str) {
        try {
            File fileOq = oq(str);
            if (fileOq == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileOq);
            bob bobVar = fileOq.getAbsolutePath().endsWith(".zip") ? bob.ZIP : bob.JSON;
            fileOq.getAbsolutePath();
            return new Pair<>(bobVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    File kq(String str, InputStream inputStream, bob bobVar) throws IOException {
        File file = new File(kq(), kq(str, bobVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 != -1) {
                        fileOutputStream.write(bArr, 0, i10);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    void kq(String str, bob bobVar) {
        File file = new File(kq(), kq(str, bobVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        file2.toString();
        if (zRenameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File kq() {
        File fileKq = this.kq.kq();
        if (fileKq.isFile()) {
            fileKq.delete();
        }
        if (!fileKq.exists()) {
            fileKq.mkdirs();
        }
        return fileKq;
    }

    private static String kq(String str, bob bobVar, boolean z9) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z9 ? bobVar.kq() : bobVar.bob);
        return sb.toString();
    }
}
