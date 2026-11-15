package com.bytedance.sdk.component.csi.fou.bob.oq;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.csi.fou.bob.rhi;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.component.utils.rjo;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class kq {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.csi.fou.bob.oq.kq$kq, reason: collision with other inner class name */
    public interface InterfaceC0246kq {
        void kq();

        void kq(Drawable drawable);

        void kq(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oq(byte[] bArr, rhi rhiVar, InterfaceC0246kq interfaceC0246kq) {
        FileOutputStream fileOutputStream = null;
        try {
            boolean zRjo = rhiVar.rjo();
            File fileKq = rjo.kq(rhiVar.kq(), zRjo, zRjo ? "P_GIF_MUTIL_CACHE/" : "/P_GIF_CACHE/", "P_U_GIF_FILE");
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileKq);
            try {
                fileOutputStream2.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT < 28) {
                    if (interfaceC0246kq != null) {
                        interfaceC0246kq.kq(bArr);
                    }
                    try {
                        fileOutputStream2.close();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileKq));
                if (interfaceC0246kq != null) {
                    interfaceC0246kq.kq(drawableDecodeDrawable);
                }
                try {
                    fileOutputStream2.close();
                } catch (Throwable unused2) {
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    fax.kq("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (interfaceC0246kq != null) {
                        interfaceC0246kq.kq();
                    }
                } catch (Throwable th2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void kq(byte[] bArr, rhi rhiVar, InterfaceC0246kq interfaceC0246kq) {
        if (Build.VERSION.SDK_INT <= 30) {
            kq(bArr, interfaceC0246kq, rhiVar);
        } else {
            kq(bArr, interfaceC0246kq);
        }
    }

    public void kq(byte[] bArr, InterfaceC0246kq interfaceC0246kq) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT < 28) {
            if (interfaceC0246kq != null) {
                interfaceC0246kq.kq(bArr);
                return;
            }
            return;
        }
        try {
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
            if (interfaceC0246kq != null) {
                interfaceC0246kq.kq(drawableDecodeDrawable);
            }
        } catch (Throwable th) {
            fax.bob("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0246kq != null) {
                interfaceC0246kq.kq();
            }
        }
    }

    private void kq(final byte[] bArr, final InterfaceC0246kq interfaceC0246kq, final rhi rhiVar) {
        try {
            rhiVar.syt().submit(new Runnable() { // from class: com.bytedance.sdk.component.csi.fou.bob.oq.kq.1
                @Override // java.lang.Runnable
                public void run() {
                    kq.this.oq(bArr, rhiVar, interfaceC0246kq);
                }
            });
        } catch (Throwable th) {
            fax.bob("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0246kq != null) {
                interfaceC0246kq.kq();
            }
        }
    }
}
