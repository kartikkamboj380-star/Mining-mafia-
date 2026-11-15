package com.bytedance.sdk.component.csi.bob.kq.kq;

import android.util.Log;
import com.bytedance.sdk.component.utils.nn;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class oq implements com.bytedance.sdk.component.csi.bob {
    private long kq;
    private kq oq;

    public oq(File file, long j10, ExecutorService executorService) {
        this.kq = j10;
        try {
            this.oq = kq.kq(file, 20210302, 1, j10, executorService);
        } catch (IOException e10) {
            Log.w("LruCountDiskCache", e10.toString());
        }
    }

    @Override // com.bytedance.sdk.component.csi.kq
    /* JADX INFO: renamed from: bob, reason: merged with bridge method [inline-methods] */
    public boolean oq(String str) {
        try {
            try {
                kq.bob bobVarKq = this.oq.kq(str);
                boolean z9 = bobVarKq != null;
                nn.kq(bobVarKq);
                return z9;
            } catch (IOException e10) {
                Log.w("LruCountDiskCache", e10.getMessage());
                nn.kq(null);
                return false;
            }
        } catch (Throwable th) {
            nn.kq(null);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // com.bytedance.sdk.component.csi.kq
    /* JADX INFO: renamed from: oq, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] kq(String str) throws Throwable {
        ?? r10;
        ByteArrayOutputStream byteArrayOutputStream;
        kq kqVar = this.oq;
        ?? r11 = 0;
        if (kqVar != null) {
            try {
                if (str != 0) {
                    try {
                        kq.bob bobVarKq = kqVar.kq((String) str);
                        if (bobVarKq == null) {
                            nn.kq(null);
                            nn.kq(null);
                            return null;
                        }
                        str = bobVarKq.kq(0);
                        if (str != 0) {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                                    while (true) {
                                        int i10 = str.read(bArr);
                                        if (i10 == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr, 0, i10);
                                    }
                                } catch (IOException e10) {
                                    e = e10;
                                    r10 = str;
                                }
                            } catch (IOException e11) {
                                e = e11;
                                byteArrayOutputStream = null;
                                r10 = str;
                            } catch (Throwable th) {
                                th = th;
                                r11 = str;
                                nn.kq(r11);
                                nn.kq(0);
                                throw th;
                            }
                        } else {
                            byteArrayOutputStream = null;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        nn.kq(str);
                        nn.kq(byteArrayOutputStream);
                        return byteArray;
                    } catch (IOException e12) {
                        e = e12;
                        r10 = 0;
                        byteArrayOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        nn.kq(r11);
                        nn.kq(0);
                        throw th;
                    }
                    Log.w("LruCountDiskCache", e.toString());
                    nn.kq(r10);
                    nn.kq(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.csi.bob
    public InputStream kq(String str) throws Throwable {
        kq kqVar = this.oq;
        if (kqVar == null) {
            return null;
        }
        try {
            kq.bob bobVarKq = kqVar.kq(str);
            if (bobVarKq != null) {
                return bobVarKq.kq(0);
            }
        } catch (IOException e10) {
            Log.w("LruCountDiskCache", e10.getMessage());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.csi.kq
    public boolean kq(String str, byte[] bArr) throws Throwable {
        kq kqVar = this.oq;
        if (kqVar == null || bArr == null || str == null) {
            return false;
        }
        Closeable closeable = null;
        kq.C0244kq c0244kq = null;
        try {
            try {
                kq.C0244kq c0244kqOq = kqVar.oq(str);
                try {
                    if (c0244kqOq == null) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                        nn.kq(null);
                        return false;
                    }
                    OutputStream outputStreamKq = c0244kqOq.kq(0);
                    if (outputStreamKq == kq.bob) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
                        nn.kq(outputStreamKq);
                        return false;
                    }
                    outputStreamKq.write(bArr);
                    c0244kqOq.kq();
                    this.oq.kq();
                    nn.kq(outputStreamKq);
                    return true;
                } catch (IOException e10) {
                    e = e10;
                    c0244kq = c0244kqOq;
                    try {
                        Log.w("LruCountDiskCache", e.toString());
                        if (c0244kq != null) {
                            try {
                                c0244kq.oq();
                            } catch (IOException unused) {
                            }
                        }
                        nn.kq(0);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        closeable = closeable;
                        nn.kq(closeable);
                        throw th;
                    }
                }
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
            nn.kq(closeable);
            throw th;
        }
    }
}
