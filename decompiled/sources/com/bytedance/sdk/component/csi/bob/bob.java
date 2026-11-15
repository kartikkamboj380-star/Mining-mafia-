package com.bytedance.sdk.component.csi.bob;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.csi.dgq;
import com.bytedance.sdk.component.csi.gm;
import com.bytedance.sdk.component.csi.mq;
import com.bytedance.sdk.component.csi.mxq;
import com.bytedance.sdk.component.csi.nn;
import com.bytedance.sdk.component.csi.suf;
import com.bytedance.sdk.component.csi.syt;
import com.bytedance.sdk.component.csi.ubx;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class bob implements dgq {
    private String bob;
    private mxq csi;
    private int dgq;
    private int ebt;
    private boolean fax;
    private boolean fgm;
    private String fou;
    private final Handler gm;
    private ExecutorService ha;
    private int ibd;
    private int jhe;
    Future<?> kq;
    private com.bytedance.sdk.component.csi.rjo mq;
    private gm mxq;
    private com.bytedance.sdk.component.csi.bob.kq nb;
    private syt nn;
    private boolean nze;
    private String oq;
    private com.bytedance.sdk.component.csi.oq ou;
    private ImageView.ScaleType rhi;
    private Bitmap.Config rjo;
    private boolean rs;
    private int sns;
    private boolean suf;
    private int syt;
    private int ubx;
    private rhi uml;
    private WeakReference<ImageView> vvw;
    private Queue<com.bytedance.sdk.component.csi.csi.dgq> wcx;
    private volatile boolean wki;
    private suf zfx;

    private class kq implements mxq {
        private mxq oq;

        public kq(mxq mxqVar) {
            this.oq = mxqVar;
        }

        @Override // com.bytedance.sdk.component.csi.mxq
        public void kq(final ubx ubxVar) {
            Bitmap bitmapKq;
            final ImageView imageView = (ImageView) bob.this.vvw.get();
            if (imageView != null && bob.this.ubx != 3 && kq(imageView) && (ubxVar.oq() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) ubxVar.oq();
                bob.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.component.csi.bob.bob.kq.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            try {
                if (bob.this.nn != null && (ubxVar.oq() instanceof Bitmap) && (bitmapKq = bob.this.nn.kq((Bitmap) ubxVar.oq())) != null) {
                    ubxVar.kq(bitmapKq);
                }
            } catch (Throwable unused) {
            }
            if (bob.this.sns == 5) {
                bob.this.gm.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.csi.bob.bob.kq.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (kq.this.oq != null) {
                            kq.this.oq.kq(ubxVar);
                        }
                    }
                });
                return;
            }
            mxq mxqVar = this.oq;
            if (mxqVar != null) {
                mxqVar.kq(ubxVar);
            }
        }

        private boolean kq(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(bob.this.bob)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.csi.mxq
        public void kq(final int i10, final String str, final Throwable th) {
            if (bob.this.sns == 5) {
                bob.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.component.csi.bob.bob.kq.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (kq.this.oq != null) {
                            kq.this.oq.kq(i10, str, th);
                        }
                    }
                });
                return;
            }
            mxq mxqVar = this.oq;
            if (mxqVar != null) {
                mxqVar.kq(i10, str, th);
            }
        }
    }

    public static class oq implements nn {
        private String bob;
        private ImageView.ScaleType csi;
        private boolean fax;
        private String fou;
        private int gm;
        private boolean jhe;
        private mxq kq;
        private ExecutorService mq;
        private rhi mxq;
        private com.bytedance.sdk.component.csi.oq nze;
        private ImageView oq;
        private Bitmap.Config rhi;
        private int rjo;
        private syt sns;
        private String suf;
        private int syt;
        private gm ubx;
        private suf uml;
        private boolean vvw;
        private int wcx;
        private boolean wki;
        private int dgq = 1;
        private int nn = 5;

        public oq(rhi rhiVar) {
            this.mxq = rhiVar;
        }

        public nn bob(String str) {
            this.fou = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public nn csi(int i10) {
            this.gm = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public nn fou(int i10) {
            this.wcx = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public nn kq(String str) {
            this.bob = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public nn oq(int i10) {
            this.syt = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public nn bob(int i10) {
            this.dgq = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public nn kq(ImageView.ScaleType scaleType) {
            this.csi = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public nn oq(String str) {
            this.suf = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public nn kq(Bitmap.Config config) {
            this.rhi = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public nn kq(int i10) {
            this.rjo = i10;
            return this;
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public nn kq(gm gmVar) {
            this.ubx = gmVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public nn kq(boolean z9) {
            this.wki = z9;
            return this;
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public dgq kq(mxq mxqVar, int i10) {
            this.nn = i10;
            return kq(mxqVar);
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public dgq kq(mxq mxqVar) {
            this.kq = mxqVar;
            return new bob(this).uml();
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public dgq kq(ImageView imageView) {
            this.oq = imageView;
            return new bob(this).uml();
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public nn kq(syt sytVar) {
            this.sns = sytVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dgq uml() {
        try {
            if (this.uml == null) {
                mxq mxqVar = this.csi;
                if (mxqVar != null) {
                    mxqVar.kq(1005, "not init !", null);
                    return this;
                }
            } else {
                String strKq = kq();
                if (TextUtils.isEmpty(strKq)) {
                    mxq mxqVar2 = this.csi;
                    if (mxqVar2 != null) {
                        mxqVar2.kq(2000, "url is empty", null);
                        return this;
                    }
                } else {
                    mq mqVarCsi = this.uml.csi();
                    if (!strKq.startsWith("http://") && !strKq.startsWith("https://") && mqVarCsi != null) {
                        mqVarCsi.kq(1006, "url is not validate ".concat(strKq));
                    }
                    ExecutorService executorServiceRjo = this.ha == null ? this.uml.rjo() : null;
                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.csi.bob.bob.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.csi.csi.dgq dgqVar;
                            while (!bob.this.wki && (dgqVar = (com.bytedance.sdk.component.csi.csi.dgq) bob.this.wcx.poll()) != null) {
                                try {
                                    if (bob.this.mxq != null) {
                                        bob.this.mxq.kq(dgqVar.kq(), bob.this);
                                    }
                                    dgqVar.kq(bob.this);
                                    if (bob.this.mxq != null) {
                                        bob.this.mxq.oq(dgqVar.kq(), bob.this);
                                    }
                                } catch (Throwable th) {
                                    bob.this.kq(2000, th.getMessage(), th);
                                    if (bob.this.mxq != null) {
                                        bob.this.mxq.oq("exception", bob.this);
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (bob.this.wki) {
                                bob.this.kq(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, "canceled", null);
                            }
                        }
                    };
                    if (this.fgm) {
                        runnable.run();
                        return this;
                    }
                    ExecutorService executorService = this.ha;
                    if (executorService != null) {
                        this.kq = executorService.submit(runnable);
                        return this;
                    }
                    if (executorServiceRjo != null) {
                        this.kq = executorServiceRjo.submit(runnable);
                    }
                }
            }
            return this;
        } catch (Exception e10) {
            Log.e("ImageRequest", e10.getMessage());
            return this;
        }
    }

    public boolean fax() {
        return this.rs;
    }

    public com.bytedance.sdk.component.csi.oq gm() {
        return this.ou;
    }

    public String jhe() {
        return nn() + vvw();
    }

    public suf mq() {
        return this.zfx;
    }

    public com.bytedance.sdk.component.csi.rjo mxq() {
        return this.mq;
    }

    public boolean nze() {
        return this.fax;
    }

    public int sns() {
        return this.jhe;
    }

    public boolean suf() {
        return this.nze;
    }

    public Bitmap.Config ubx() {
        return this.rjo;
    }

    public int vvw() {
        return this.ubx;
    }

    public rhi wcx() {
        return this.uml;
    }

    public boolean wki() {
        return this.suf;
    }

    private bob(oq oqVar) {
        this.wcx = new LinkedBlockingQueue();
        this.gm = new Handler(Looper.getMainLooper());
        this.fax = true;
        this.oq = oqVar.fou;
        this.csi = new kq(oqVar.kq);
        this.vvw = new WeakReference<>(oqVar.oq);
        this.rhi = oqVar.csi;
        this.rjo = oqVar.rhi;
        this.syt = oqVar.rjo;
        this.dgq = oqVar.syt;
        this.ubx = oqVar.dgq;
        this.sns = oqVar.nn;
        this.mxq = oqVar.ubx;
        this.ou = kq(oqVar);
        if (!TextUtils.isEmpty(oqVar.bob)) {
            oq(oqVar.bob);
            kq(oqVar.bob);
        }
        this.suf = oqVar.vvw;
        this.nze = oqVar.wki;
        this.uml = oqVar.mxq;
        this.nn = oqVar.sns;
        this.ibd = oqVar.gm;
        this.ebt = oqVar.wcx;
        this.ha = oqVar.mq;
        this.rs = oqVar.fax;
        this.fgm = oqVar.jhe;
        this.zfx = oqVar.uml;
        this.wcx.add(new com.bytedance.sdk.component.csi.csi.bob());
    }

    @Override // com.bytedance.sdk.component.csi.dgq
    public int bob() {
        return this.dgq;
    }

    @Override // com.bytedance.sdk.component.csi.dgq
    public Bitmap.Config csi() {
        return this.rjo;
    }

    public String dgq() {
        return this.fou;
    }

    @Override // com.bytedance.sdk.component.csi.dgq
    public ImageView.ScaleType fou() {
        return this.rhi;
    }

    public String nn() {
        return this.bob;
    }

    public void oq(String str) {
        WeakReference<ImageView> weakReference = this.vvw;
        if (weakReference != null && weakReference.get() != null) {
            this.vvw.get().setTag(1094453505, str);
        }
        this.bob = str;
    }

    public int rhi() {
        return this.ebt;
    }

    public int rjo() {
        return this.ibd;
    }

    public mxq syt() {
        return this.csi;
    }

    private com.bytedance.sdk.component.csi.oq kq(oq oqVar) {
        if (oqVar.nze != null) {
            return oqVar.nze;
        }
        if (!TextUtils.isEmpty(oqVar.suf)) {
            return com.bytedance.sdk.component.csi.bob.kq.kq.kq(new File(oqVar.suf));
        }
        return com.bytedance.sdk.component.csi.bob.kq.kq.nn();
    }

    @Override // com.bytedance.sdk.component.csi.dgq
    public int oq() {
        return this.syt;
    }

    @Override // com.bytedance.sdk.component.csi.dgq
    public String kq() {
        return this.oq;
    }

    public void kq(String str) {
        this.fou = str;
    }

    public void kq(boolean z9) {
        this.fax = z9;
    }

    public void kq(com.bytedance.sdk.component.csi.rjo rjoVar) {
        this.mq = rjoVar;
    }

    public void kq(int i10) {
        this.jhe = i10;
    }

    public void kq(com.bytedance.sdk.component.csi.bob.kq kqVar) {
        this.nb = kqVar;
    }

    public boolean kq(com.bytedance.sdk.component.csi.csi.dgq dgqVar) {
        if (this.wki) {
            return false;
        }
        return this.wcx.add(dgqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(int i10, String str, Throwable th) {
        new com.bytedance.sdk.component.csi.csi.syt(i10, str, th).kq(this);
        this.wcx.clear();
    }
}
