package com.bytedance.sdk.component.csi.bob.kq.kq;

import android.util.Log;
import com.bytedance.sdk.component.utils.nn;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class kq implements Closeable {
    private final File csi;
    private long dgq;
    private final File fou;
    private final int nn;
    final ExecutorService oq;
    private final File rhi;
    private final File rjo;
    private int suf;
    private final int syt;
    private Writer vvw;
    static final Pattern kq = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream bob = new OutputStream() { // from class: com.bytedance.sdk.component.csi.bob.kq.kq.kq.2
        @Override // java.io.OutputStream
        public void write(int i10) {
        }
    };
    private long ubx = 0;
    private final LinkedHashMap<String, oq> wki = new LinkedHashMap<>(0, 0.75f, true);
    private long nze = -1;
    private long mxq = 0;
    private final Callable<Void> sns = new Callable<Void>() { // from class: com.bytedance.sdk.component.csi.bob.kq.kq.kq.1
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (kq.this) {
                try {
                    if (kq.this.vvw == null) {
                        return null;
                    }
                    kq.this.syt();
                    if (kq.this.rhi()) {
                        kq.this.csi();
                        kq.this.suf = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    public final class bob implements Closeable {
        private final long bob;
        private final long[] csi;
        private final InputStream[] fou;
        private final String oq;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.fou) {
                nn.kq(inputStream);
            }
        }

        public InputStream kq(int i10) {
            return this.fou[i10];
        }

        private bob(String str, long j10, InputStream[] inputStreamArr, long[] jArr) {
            this.oq = str;
            this.bob = j10;
            this.fou = inputStreamArr;
            this.csi = jArr;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.csi.bob.kq.kq.kq$kq, reason: collision with other inner class name */
    public final class C0244kq {
        private final boolean[] bob;
        private boolean csi;
        private boolean fou;
        private final oq oq;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.csi.bob.kq.kq.kq$kq$kq, reason: collision with other inner class name */
        private class C0245kq extends FilterOutputStream {
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0244kq.this.fou = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0244kq.this.fou = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    C0244kq.this.fou = true;
                }
            }

            private C0245kq(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    C0244kq.this.fou = true;
                }
            }
        }

        private C0244kq(oq oqVar) {
            this.oq = oqVar;
            this.bob = oqVar.fou ? null : new boolean[kq.this.nn];
        }

        public void oq() {
            kq.this.kq(this, false);
        }

        public OutputStream kq(int i10) {
            FileOutputStream fileOutputStream;
            C0245kq c0245kq;
            if (i10 < 0 || i10 >= kq.this.nn) {
                throw new IllegalArgumentException("Expected index " + i10 + " to be greater than 0 and less than the maximum value count of " + kq.this.nn);
            }
            synchronized (kq.this) {
                try {
                    if (this.oq.csi == this) {
                        if (!this.oq.fou) {
                            this.bob[i10] = true;
                        }
                        File fileOq = this.oq.oq(i10);
                        try {
                            fileOutputStream = new FileOutputStream(fileOq);
                        } catch (FileNotFoundException unused) {
                            kq.this.fou.mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(fileOq);
                            } catch (FileNotFoundException unused2) {
                                return kq.bob;
                            }
                        }
                        c0245kq = new C0245kq(fileOutputStream);
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0245kq;
        }

        public void kq() {
            if (this.fou) {
                kq.this.kq(this, false);
                kq.this.bob(this.oq.oq);
            } else {
                kq.this.kq(this, true);
            }
            this.csi = true;
        }
    }

    private final class oq {
        private final long[] bob;
        private C0244kq csi;
        private boolean fou;
        private final String oq;
        private long rhi;

        private oq(String str) {
            this.oq = str;
            this.bob = new long[kq.this.nn];
        }

        private IOException oq(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File oq(int i10) {
            return new File(kq.this.fou, this.oq + "." + i10 + ".tmp");
        }

        public String kq() {
            StringBuilder sb = new StringBuilder();
            for (long j10 : this.bob) {
                sb.append(' ');
                sb.append(j10);
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void kq(String[] strArr) throws IOException {
            if (strArr.length == kq.this.nn) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.bob[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw oq(strArr);
                    }
                }
                return;
            }
            throw oq(strArr);
        }

        public File kq(int i10) {
            return new File(kq.this.fou, this.oq + "." + i10);
        }
    }

    private kq(File file, int i10, int i11, long j10, ExecutorService executorService) {
        this.fou = file;
        this.syt = i10;
        this.csi = new File(file, "journal");
        this.rhi = new File(file, "journal.tmp");
        this.rjo = new File(file, "journal.bkp");
        this.nn = i11;
        this.dgq = j10;
        this.oq = executorService;
    }

    private void rjo() {
        if (this.vvw == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syt() {
        long j10 = this.dgq;
        long j11 = this.nze;
        if (j11 >= 0) {
            j10 = j11;
        }
        while (this.ubx > j10) {
            bob(this.wki.entrySet().iterator().next().getKey());
        }
        this.nze = -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.vvw == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.wki.values());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                oq oqVar = (oq) obj;
                if (oqVar.csi != null) {
                    oqVar.csi.oq();
                }
            }
            syt();
            this.vvw.close();
            this.vvw = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void bob() {
        com.bytedance.sdk.component.csi.bob.kq.kq.bob bobVar = new com.bytedance.sdk.component.csi.bob.kq.kq.bob(new FileInputStream(this.csi), fou.kq);
        try {
            String strKq = bobVar.kq();
            String strKq2 = bobVar.kq();
            String strKq3 = bobVar.kq();
            String strKq4 = bobVar.kq();
            String strKq5 = bobVar.kq();
            if (!"libcore.io.DiskLruCache".equals(strKq) || !UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(strKq2) || !Integer.toString(this.syt).equals(strKq3) || !Integer.toString(this.nn).equals(strKq4) || !"".equals(strKq5)) {
                throw new IOException("unexpected journal header: [" + strKq + ", " + strKq2 + ", " + strKq4 + ", " + strKq5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    fou(bobVar.kq());
                    i10++;
                } catch (EOFException unused) {
                    this.suf = i10 - this.wki.size();
                    if (bobVar.oq()) {
                        csi();
                    } else {
                        this.vvw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.csi, true), fou.kq));
                    }
                    nn.kq(bobVar);
                    return;
                }
            }
        } catch (Throwable th) {
            nn.kq(bobVar);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void csi() {
        try {
            Writer writer = this.vvw;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.rhi), fou.kq));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.syt));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.nn));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (oq oqVar : this.wki.values()) {
                    if (oqVar.csi != null) {
                        bufferedWriter.write("DIRTY " + oqVar.oq + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + oqVar.oq + oqVar.kq() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.csi.exists()) {
                    kq(this.csi, this.rjo, true);
                }
                kq(this.rhi, this.csi, false);
                this.rjo.delete();
                this.vvw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.csi, true), fou.kq));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void fou(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.wki.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        oq oqVar = this.wki.get(strSubstring);
        if (oqVar == null) {
            oqVar = new oq(strSubstring);
            this.wki.put(strSubstring, oqVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            oqVar.fou = true;
            oqVar.csi = null;
            oqVar.kq(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            oqVar.csi = new C0244kq(oqVar);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean rhi() {
        int i10 = this.suf;
        return i10 >= 2000 && i10 >= this.wki.size();
    }

    public C0244kq oq(String str) {
        return kq(str, -1L);
    }

    public void oq() throws IOException {
        close();
        fou.kq(this.fou);
    }

    public static kq kq(File file, int i10, int i11, long j10, ExecutorService executorService) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    kq(file2, file3, false);
                }
            }
            kq kqVar = new kq(file, i10, i11, j10, executorService);
            if (kqVar.csi.exists()) {
                try {
                    kqVar.bob();
                    kqVar.fou();
                    return kqVar;
                } catch (IOException e10) {
                    Log.w("DiskLruCache ", file + " is corrupt: " + e10.getMessage() + ", removing");
                    kqVar.oq();
                }
            }
            file.mkdirs();
            kq kqVar2 = new kq(file, i10, i11, j10, executorService);
            kqVar2.csi();
            return kqVar2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    public synchronized boolean bob(String str) {
        try {
            rjo();
            csi(str);
            oq oqVar = this.wki.get(str);
            if (oqVar != null && oqVar.csi == null) {
                for (int i10 = 0; i10 < this.nn; i10++) {
                    File fileKq = oqVar.kq(i10);
                    if (fileKq.exists() && !fileKq.delete()) {
                        throw new IOException("failed to delete ".concat(String.valueOf(fileKq)));
                    }
                    this.ubx -= oqVar.bob[i10];
                    oqVar.bob[i10] = 0;
                }
                this.suf++;
                this.vvw.append((CharSequence) ("REMOVE " + str + '\n'));
                this.wki.remove(str);
                if (rhi()) {
                    this.oq.submit(this.sns);
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void fou() throws IOException {
        kq(this.rhi);
        Iterator<oq> it = this.wki.values().iterator();
        while (it.hasNext()) {
            oq next = it.next();
            int i10 = 0;
            if (next.csi != null) {
                next.csi = null;
                while (i10 < this.nn) {
                    kq(next.kq(i10));
                    kq(next.oq(i10));
                    i10++;
                }
                it.remove();
            } else {
                while (i10 < this.nn) {
                    this.ubx += next.bob[i10];
                    i10++;
                }
            }
        }
    }

    private static void kq(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void kq(File file, File file2, boolean z9) throws IOException {
        if (z9) {
            kq(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void csi(String str) {
        if (kq.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    public synchronized bob kq(String str) throws Throwable {
        Throwable th;
        InputStream inputStream;
        try {
            rjo();
            csi(str);
            oq oqVar = this.wki.get(str);
            if (oqVar == null) {
                return null;
            }
            if (!oqVar.fou) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.nn];
            for (int i10 = 0; i10 < this.nn; i10++) {
                try {
                    try {
                        try {
                            inputStreamArr[i10] = new FileInputStream(oqVar.kq(i10));
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i11 = 0; i11 < this.nn && (inputStream = inputStreamArr[i11]) != null; i11++) {
                            nn.kq(inputStream);
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            }
            this.suf++;
            this.vvw.append((CharSequence) ("READ " + str + '\n'));
            if (rhi()) {
                this.oq.submit(this.sns);
            }
            return new bob(str, oqVar.rhi, inputStreamArr, oqVar.bob);
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    private synchronized C0244kq kq(String str, long j10) {
        rjo();
        csi(str);
        oq oqVar = this.wki.get(str);
        if (j10 != -1 && (oqVar == null || oqVar.rhi != j10)) {
            return null;
        }
        if (oqVar != null) {
            if (oqVar.csi != null) {
                return null;
            }
        } else {
            oqVar = new oq(str);
            this.wki.put(str, oqVar);
        }
        C0244kq c0244kq = new C0244kq(oqVar);
        oqVar.csi = c0244kq;
        this.vvw.write("DIRTY " + str + '\n');
        this.vvw.flush();
        return c0244kq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void kq(C0244kq c0244kq, boolean z9) {
        oq oqVar = c0244kq.oq;
        if (oqVar.csi == c0244kq) {
            if (z9 && !oqVar.fou) {
                for (int i10 = 0; i10 < this.nn; i10++) {
                    if (c0244kq.bob[i10]) {
                        if (!oqVar.oq(i10).exists()) {
                            c0244kq.oq();
                            return;
                        }
                    } else {
                        c0244kq.oq();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i10)));
                    }
                }
            }
            for (int i11 = 0; i11 < this.nn; i11++) {
                File fileOq = oqVar.oq(i11);
                if (z9) {
                    if (fileOq.exists()) {
                        File fileKq = oqVar.kq(i11);
                        fileOq.renameTo(fileKq);
                        long j10 = oqVar.bob[i11];
                        long length = fileKq.length();
                        oqVar.bob[i11] = length;
                        this.ubx = (this.ubx - j10) + length;
                    }
                } else {
                    kq(fileOq);
                }
            }
            this.suf++;
            oqVar.csi = null;
            if (!(oqVar.fou | z9)) {
                this.wki.remove(oqVar.oq);
                this.vvw.write("REMOVE " + oqVar.oq + '\n');
            } else {
                oqVar.fou = true;
                this.vvw.write("CLEAN " + oqVar.oq + oqVar.kq() + '\n');
                if (z9) {
                    long j11 = this.mxq;
                    this.mxq = 1 + j11;
                    oqVar.rhi = j11;
                }
            }
            this.vvw.flush();
            if (this.ubx > this.dgq || rhi()) {
                this.oq.submit(this.sns);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized void kq() {
        rjo();
        syt();
        this.vvw.flush();
    }
}
