package com.bytedance.sdk.component.rjo.oq;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.oq.kq.rhi;
import com.bytedance.sdk.component.oq.kq.suf;
import com.bytedance.sdk.component.oq.kq.ubx;
import com.bytedance.sdk.component.oq.kq.vvw;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public class kq extends bob {
    public File kq;
    private volatile boolean nn;
    public File oq;

    public kq(ubx ubxVar) {
        super(ubxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean csi(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long rhi(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else {
            str = map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        }
        if (!TextUtils.isEmpty(str) && str != null) {
            try {
                return Long.valueOf(str).longValue();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean rjo(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    public void kq(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.kq = new File(str, str2);
        this.oq = new File(str, str2 + ".temp");
    }

    @Override // com.bytedance.sdk.component.rjo.oq.bob
    public void oq() {
        this.nn = true;
        super.oq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void csi() {
        try {
            this.kq.delete();
        } catch (Throwable unused) {
        }
        try {
            this.oq.delete();
        } catch (Throwable unused2) {
        }
    }

    public void kq(final com.bytedance.sdk.component.rjo.kq.kq kqVar) {
        File file = this.kq;
        if (file == null || this.oq == null) {
            if (kqVar != null) {
                kqVar.kq(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.kq.length() != 0 && kqVar != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.rjo.oq oqVar = new com.bytedance.sdk.component.rjo.oq(true, TTAdConstant.MATE_VALID, "Success", null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            oqVar.kq(this.kq);
            kqVar.kq(this, oqVar);
            return;
        }
        long length = this.oq.length();
        final long j10 = length >= 0 ? length : 0L;
        vvw.kq kqVar2 = new vvw.kq();
        kqVar2.kq((Object) bob());
        oq("Range", "bytes=" + j10 + "-");
        if (TextUtils.isEmpty(this.syt)) {
            kqVar.kq(this, new IOException("Url is Empty"));
            return;
        }
        try {
            kqVar2.oq(this.syt);
            if (!TextUtils.isEmpty(this.csi)) {
                kqVar2.kq(this.csi);
            }
            int i10 = this.rhi;
            if (i10 > 0) {
                kqVar2.kq(i10);
            }
            kq(kqVar2);
            com.bytedance.sdk.component.oq.kq.oq oqVarKq = this.bob.kq(kqVar2.kq().oq());
            if (oqVarKq == null) {
                kqVar.kq(this, new IOException("new call error"));
            } else {
                oqVarKq.kq(new com.bytedance.sdk.component.oq.kq.bob() { // from class: com.bytedance.sdk.component.rjo.oq.kq.1
                    @Override // com.bytedance.sdk.component.oq.kq.bob
                    public void kq(com.bytedance.sdk.component.oq.kq.oq oqVar2, IOException iOException) {
                        com.bytedance.sdk.component.rjo.kq.kq kqVar3 = kqVar;
                        if (kqVar3 != null) {
                            kqVar3.kq(kq.this, iOException);
                        }
                        kq.this.csi();
                    }

                    @Override // com.bytedance.sdk.component.oq.kq.bob
                    public void kq(com.bytedance.sdk.component.oq.kq.oq oqVar2, suf sufVar) {
                        RandomAccessFile randomAccessFile;
                        long j11;
                        InputStream inputStreamBob;
                        byte[] bArr;
                        long j12;
                        int i11;
                        if (kqVar == null) {
                            return;
                        }
                        HashMap map = new HashMap();
                        if (sufVar == null) {
                            return;
                        }
                        rhi rhiVarRjo = sufVar.rjo();
                        if (rhiVarRjo != null) {
                            for (int i12 = 0; i12 < rhiVarRjo.kq(); i12++) {
                                map.put(rhiVarRjo.kq(i12), rhiVarRjo.oq(i12));
                            }
                        }
                        com.bytedance.sdk.component.rjo.oq oqVar3 = new com.bytedance.sdk.component.rjo.oq(sufVar.fou(), sufVar.bob(), sufVar.csi(), map, null, sufVar.oq(), sufVar.kq());
                        if (sufVar.fou()) {
                            long jKq = sufVar.rhi().kq();
                            long j13 = 0;
                            if (jKq <= 0) {
                                jKq = kq.rhi(map);
                            }
                            boolean zCsi = kq.csi(map);
                            if (zCsi) {
                                jKq += j10;
                                String str = (String) map.get("Content-Range");
                                if (!TextUtils.isEmpty(str)) {
                                    String str2 = "bytes " + j10 + "-" + (jKq - 1);
                                    if (TextUtils.indexOf(str, str2) == -1) {
                                        kq.this.csi();
                                        kqVar.kq(kq.this, new IOException("The Content-Range Header is invalid Assume[" + str2 + "] vs Real[" + str + "], please remove the temporary file [" + kq.this.oq + "]."));
                                        return;
                                    }
                                }
                            }
                            if (jKq > 0 && kq.this.oq.exists() && kq.this.oq.length() == jKq) {
                                kq kqVar3 = kq.this;
                                if (!kqVar3.oq.renameTo(kqVar3.kq)) {
                                    kqVar.kq(kq.this, new IOException("Rename fail"));
                                    return;
                                } else {
                                    oqVar3.kq(kq.this.kq);
                                    kqVar.kq(kq.this, oqVar3);
                                    return;
                                }
                            }
                            InputStream inputStream = null;
                            try {
                                try {
                                    randomAccessFile = new RandomAccessFile(kq.this.oq, "rw");
                                    try {
                                        if (zCsi) {
                                            randomAccessFile.seek(j10);
                                            j11 = j10;
                                        } else {
                                            randomAccessFile.setLength(0L);
                                            j11 = 0;
                                        }
                                        while (true) {
                                            long j14 = j13;
                                            int i13 = inputStreamBob.read(bArr, i11, 16384 - i11);
                                            if (i13 != -1) {
                                                i11 += i13;
                                                j12 += (long) i13;
                                                if (j12 % 16384 == j14 || j12 == jKq - j10) {
                                                    randomAccessFile.seek(j11);
                                                    randomAccessFile.write(bArr, 0, i11);
                                                    j11 += (long) i11;
                                                    i11 = 0;
                                                }
                                                if (kq.this.nn) {
                                                    throw new IOException("net is cancel");
                                                }
                                                j13 = j14;
                                            } else {
                                                if (i11 != 0) {
                                                    randomAccessFile.seek(j11);
                                                    randomAccessFile.write(bArr, 0, i11);
                                                }
                                                if (!zCsi) {
                                                    jKq = kq.this.oq.length();
                                                }
                                                if (jKq > j14 && kq.this.oq.exists() && kq.this.oq.length() == jKq) {
                                                    kq kqVar4 = kq.this;
                                                    if (!kqVar4.oq.renameTo(kqVar4.kq)) {
                                                        kqVar.kq(kq.this, new IOException("Rename fail"));
                                                    } else {
                                                        oqVar3.kq(kq.this.kq);
                                                        kqVar.kq(kq.this, oqVar3);
                                                    }
                                                } else {
                                                    com.bytedance.sdk.component.rjo.kq.kq kqVar5 = kqVar;
                                                    kq kqVar6 = kq.this;
                                                    StringBuilder sb = new StringBuilder(" tempFile.length() == fileSize is");
                                                    sb.append(kq.this.oq.length() == jKq);
                                                    kqVar5.kq(kqVar6, new IOException(sb.toString()));
                                                }
                                                try {
                                                    inputStreamBob.close();
                                                } catch (Throwable unused) {
                                                }
                                                try {
                                                    randomAccessFile.close();
                                                    return;
                                                } catch (Throwable unused2) {
                                                    return;
                                                }
                                            }
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                } catch (Throwable unused4) {
                                    randomAccessFile = null;
                                }
                                inputStreamBob = sufVar.rhi().bob();
                                if (kq.rjo(map) && !(inputStreamBob instanceof GZIPInputStream)) {
                                    inputStreamBob = new GZIPInputStream(inputStreamBob);
                                }
                                bArr = new byte[16384];
                                j12 = 0;
                                i11 = 0;
                            } catch (Throwable th) {
                                try {
                                    kqVar.kq(kq.this, new IOException(th.getMessage()));
                                    if (!zCsi) {
                                        kq.this.csi();
                                    }
                                } finally {
                                    if (0 != 0) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused5) {
                                        }
                                    }
                                    try {
                                        randomAccessFile.close();
                                    } catch (Throwable unused6) {
                                    }
                                }
                            }
                        } else {
                            kqVar.kq(kq.this, oqVar3);
                        }
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            kqVar.kq(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0133 A[PHI: r10
      0x0133: PHI (r10v4 long) = (r10v3 long), (r10v8 long) binds: [B:41:0x00f9, B:44:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    public com.bytedance.sdk.component.rjo.oq kq() {
        com.bytedance.sdk.component.rjo.oq oqVar;
        RandomAccessFile randomAccessFile;
        long j10;
        InputStream inputStream;
        InputStream inputStreamBob;
        byte[] bArr;
        int i10;
        long j11;
        kq kqVar = this;
        File file = kqVar.kq;
        if (file == null || kqVar.oq == null) {
            return null;
        }
        if (file.exists() && kqVar.kq.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.rjo.oq oqVar2 = new com.bytedance.sdk.component.rjo.oq(true, TTAdConstant.MATE_VALID, "Success", null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            oqVar2.kq(kqVar.kq);
            return oqVar2;
        }
        long length = kqVar.oq.length();
        if (length < 0) {
            length = 0;
        }
        vvw.kq kqVar2 = new vvw.kq();
        kqVar2.kq((Object) kqVar.bob());
        kqVar.oq("Range", "bytes=" + length + "-");
        if (TextUtils.isEmpty(kqVar.syt)) {
            Log.e("DownloadExecutor", "execute: Url is Empty");
            return null;
        }
        try {
            kqVar2.oq(kqVar.syt);
            kqVar.kq(kqVar2);
            try {
                com.bytedance.sdk.component.oq.kq.oq oqVarKq = kqVar.bob.kq(kqVar2.kq().oq());
                if (oqVarKq == null) {
                    return null;
                }
                suf sufVarOq = oqVarKq.oq();
                if (sufVarOq == null || !sufVarOq.fou()) {
                    return null;
                }
                HashMap map = new HashMap();
                rhi rhiVarRjo = sufVarOq.rjo();
                if (rhiVarRjo != null) {
                    for (int i11 = 0; i11 < rhiVarRjo.kq(); i11++) {
                        map.put(rhiVarRjo.kq(i11), rhiVarRjo.oq(i11));
                    }
                }
                com.bytedance.sdk.component.rjo.oq oqVar3 = new com.bytedance.sdk.component.rjo.oq(sufVarOq.fou(), sufVarOq.bob(), sufVarOq.csi(), map, null, sufVarOq.oq(), sufVarOq.kq());
                long jKq = sufVarOq.rhi().kq();
                if (jKq <= 0) {
                    jKq = rhi(map);
                }
                long length2 = kqVar.oq.length();
                boolean zCsi = csi(map);
                oqVar = null;
                if (zCsi) {
                    jKq += length2;
                    try {
                        String str = (String) map.get("Content-Range");
                        if (!TextUtils.isEmpty(str)) {
                            if (TextUtils.indexOf(str, "bytes " + length2 + "-" + (jKq - 1)) == -1) {
                                Objects.toString(kqVar.oq);
                                kqVar.csi();
                                return null;
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
                if (jKq > r3 && kqVar.oq.exists() && kqVar.oq.length() == jKq) {
                    if (!kqVar.oq.renameTo(kqVar.kq)) {
                        return null;
                    }
                    oqVar3.kq(kqVar.kq);
                    return oqVar3;
                }
                try {
                    try {
                        try {
                            randomAccessFile = new RandomAccessFile(kqVar.oq, "rw");
                            try {
                                if (zCsi) {
                                    randomAccessFile.seek(length);
                                    j10 = length;
                                } else {
                                    randomAccessFile.setLength(0L);
                                    j10 = 0;
                                }
                                while (true) {
                                    int i12 = inputStreamBob.read(bArr, i10, 16384 - i10);
                                    inputStream = inputStreamBob;
                                    if (i12 != -1) {
                                        i10 += i12;
                                        j11 += (long) i12;
                                        try {
                                            if (j11 % 16384 == 0 || j11 == jKq - length) {
                                                randomAccessFile.seek(j10);
                                                randomAccessFile.write(bArr, 0, i10);
                                                j10 += (long) i10;
                                                i10 = 0;
                                            }
                                            kqVar = this;
                                            try {
                                                if (kqVar.nn) {
                                                    throw new IOException("net is cancel");
                                                }
                                                inputStreamBob = inputStream;
                                            } catch (Throwable unused2) {
                                                if (!zCsi) {
                                                    try {
                                                        kqVar.csi();
                                                    } finally {
                                                        if (inputStream != null) {
                                                            try {
                                                                inputStream.close();
                                                            } catch (Throwable unused3) {
                                                            }
                                                        }
                                                        try {
                                                            randomAccessFile.close();
                                                        } catch (Throwable unused4) {
                                                        }
                                                    }
                                                }
                                                return null;
                                            }
                                        } catch (Throwable unused5) {
                                            kqVar = this;
                                        }
                                    } else {
                                        if (i12 != 0) {
                                            randomAccessFile.seek(j10);
                                            randomAccessFile.write(bArr, 0, i10);
                                        }
                                        if (!zCsi || length == 0) {
                                            jKq = kqVar.oq.length();
                                        }
                                        if (jKq > 0 && kqVar.oq.exists() && kqVar.oq.length() == jKq) {
                                            if (kqVar.oq.renameTo(kqVar.kq)) {
                                                oqVar3.kq(kqVar.kq);
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable unused6) {
                                                }
                                                try {
                                                    randomAccessFile.close();
                                                } catch (Throwable unused7) {
                                                }
                                                return oqVar3;
                                            }
                                            try {
                                                inputStream.close();
                                            } catch (Throwable unused8) {
                                            }
                                            try {
                                                randomAccessFile.close();
                                            } catch (Throwable unused9) {
                                            }
                                            return null;
                                        }
                                        kqVar.oq.length();
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused10) {
                                        }
                                        try {
                                            randomAccessFile.close();
                                        } catch (Throwable unused11) {
                                        }
                                        return null;
                                    }
                                }
                            } catch (Throwable unused12) {
                            }
                        } catch (Throwable unused13) {
                            randomAccessFile = null;
                        }
                        if (rjo(map) && !(inputStreamBob instanceof GZIPInputStream)) {
                            inputStreamBob = new GZIPInputStream(inputStreamBob);
                        }
                        bArr = new byte[16384];
                        i10 = 0;
                        j11 = 0;
                    } catch (Throwable unused14) {
                        inputStream = inputStreamBob;
                    }
                    inputStreamBob = sufVarOq.rhi().bob();
                } catch (Throwable unused15) {
                    inputStream = null;
                }
            } catch (IOException unused16) {
                oqVar = null;
            }
            kqVar.csi();
            return oqVar;
        } catch (IllegalArgumentException unused17) {
            Log.e("DownloadExecutor", "execute: Url is not a valid HTTP or HTTPS URL");
            return null;
        }
    }
}
