package com.bytedance.sdk.component.csi.fou.bob.kq.kq;

import com.bytedance.sdk.component.csi.bob;
import com.bytedance.sdk.component.utils.nn;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class oq implements bob {
    private int kq;
    private kq oq;

    public oq(File file, long j10) {
        int i10 = (int) j10;
        this.kq = i10;
        this.oq = kq.kq(i10, file);
    }

    @Override // com.bytedance.sdk.component.csi.kq
    /* JADX INFO: renamed from: bob, reason: merged with bridge method [inline-methods] */
    public boolean oq(String str) {
        try {
            InputStream inputStreamKq = this.oq.kq(str);
            boolean z9 = inputStreamKq != null;
            nn.kq(inputStreamKq);
            return z9;
        } catch (Throwable th) {
            try {
                th.getMessage();
                return false;
            } finally {
                nn.kq(null);
            }
        }
    }

    @Override // com.bytedance.sdk.component.csi.kq
    /* JADX INFO: renamed from: oq, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public byte[] kq(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStreamKq;
        kq kqVar = this.oq;
        if (kqVar != null && str != null) {
            try {
                inputStreamKq = kqVar.kq(str);
                if (inputStreamKq != null) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                            while (true) {
                                int i10 = inputStreamKq.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i10);
                            }
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            th = th2;
                            nn.kq(inputStreamKq);
                            nn.kq(byteArrayOutputStream);
                            throw th;
                        }
                    } catch (IOException unused2) {
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                        nn.kq(inputStreamKq);
                        nn.kq(byteArrayOutputStream);
                        throw th;
                    }
                } else {
                    byteArrayOutputStream = null;
                }
                if (byteArrayOutputStream != null) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    nn.kq(inputStreamKq);
                    nn.kq(byteArrayOutputStream);
                    return byteArray;
                }
            } catch (IOException unused3) {
                inputStreamKq = null;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                byteArrayOutputStream = null;
                th = th4;
                inputStreamKq = null;
            }
            nn.kq(inputStreamKq);
            nn.kq(byteArrayOutputStream);
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.csi.bob
    public InputStream kq(String str) {
        kq kqVar = this.oq;
        if (kqVar == null) {
            return null;
        }
        return kqVar.kq(str);
    }

    @Override // com.bytedance.sdk.component.csi.kq
    public boolean kq(String str, byte[] bArr) {
        kq kqVar = this.oq;
        if (kqVar == null || bArr == null || str == null) {
            return false;
        }
        return kqVar.kq(str, bArr);
    }
}
