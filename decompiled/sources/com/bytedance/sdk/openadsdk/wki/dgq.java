package com.bytedance.sdk.openadsdk.wki;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.unity3d.services.core.device.MimeTypes;

/* JADX INFO: loaded from: classes.dex */
public class dgq {
    private final AudioManager kq;
    private int oq = -1;
    private boolean bob = false;

    public dgq(Context context) {
        this.kq = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
    }

    public int kq() {
        return this.oq;
    }

    public void kq(boolean z9) {
        kq(z9, false);
    }

    public void kq(boolean z9, boolean z10) {
        if (this.kq == null) {
            return;
        }
        int i10 = 0;
        if (z9) {
            int iRjo = DeviceUtils.rjo();
            if (iRjo != 0) {
                this.oq = iRjo;
            } else if (!z10) {
                return;
            }
            kq(3, 0, 0);
            this.bob = true;
            return;
        }
        int iDgq = this.oq;
        if (iDgq == 0) {
            iDgq = DeviceUtils.dgq() / 15;
        } else {
            if (iDgq == -1) {
                if (!z10) {
                    return;
                } else {
                    iDgq = DeviceUtils.dgq() / 15;
                }
            }
            this.oq = -1;
            kq(3, iDgq, i10);
            this.bob = true;
        }
        i10 = 1;
        this.oq = -1;
        kq(3, iDgq, i10);
        this.bob = true;
    }

    private void kq(int i10, int i11, int i12) {
        try {
            this.kq.setStreamVolume(i10, i11, i12);
        } catch (Throwable unused) {
        }
    }
}
