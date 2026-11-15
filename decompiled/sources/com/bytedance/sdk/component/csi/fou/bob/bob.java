package com.bytedance.sdk.component.csi.fou.bob;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.dgq.fou.a;
import com.bytedance.adsdk.ugeno.dgq.fou.b;
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
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class bob implements dgq {
    private String bob;
    private mxq csi;
    private int dgq;
    private ExecutorService ebt;
    private com.bytedance.sdk.component.csi.rjo fax;
    private String fou;
    private boolean gm;
    private byte[] ha;
    private boolean ibd;
    private rhi jhe;
    Future<?> kq;
    private int mq;
    private gm mxq;
    private int nb;
    private syt nn;
    private boolean nze;
    private String oq;
    private int ou;
    private ImageView.ScaleType rhi;
    private Bitmap.Config rjo;
    private suf rs;
    private int sns;
    private boolean suf;
    private int syt;
    private int ubx;
    private com.bytedance.sdk.component.csi.oq uml;
    private WeakReference<ImageView> vvw;
    private final Handler wcx;
    private volatile boolean wki;

    private class kq implements mxq {
        private mxq oq;

        public kq(mxq mxqVar) {
            this.oq = mxqVar;
        }

        @Override // com.bytedance.sdk.component.csi.mxq
        public void kq(final ubx ubxVar) {
            Bitmap bitmapKq;
            final ImageView imageView = (ImageView) bob.this.vvw.get();
            if (imageView != null && bob.this.ubx != 3 && kq(imageView)) {
                Object objOq = ubxVar.oq();
                if (objOq instanceof Bitmap) {
                    final Bitmap bitmap = (Bitmap) ubxVar.oq();
                    bob.this.wcx.post(new Runnable() { // from class: com.bytedance.sdk.component.csi.fou.bob.bob.kq.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } else if (objOq instanceof Drawable) {
                    final Drawable drawable = (Drawable) ubxVar.oq();
                    bob.this.wcx.post(new Runnable() { // from class: com.bytedance.sdk.component.csi.fou.bob.bob.kq.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && a.a(drawable)) {
                                b.a(drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            }
            try {
                if (bob.this.nn != null && (ubxVar.oq() instanceof Bitmap) && (bitmapKq = bob.this.nn.kq((Bitmap) ubxVar.oq())) != null) {
                    ubxVar.kq(bitmapKq);
                }
            } catch (Throwable unused) {
            }
            if (bob.this.sns == 5) {
                bob.this.wcx.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.csi.fou.bob.bob.kq.3
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
                bob.this.wcx.post(new Runnable() { // from class: com.bytedance.sdk.component.csi.fou.bob.bob.kq.4
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
        private ExecutorService fax;
        private String fou;
        private int gm;
        private suf jhe;
        private mxq kq;
        private boolean mq;
        private rhi mxq;
        private com.bytedance.sdk.component.csi.oq nze;
        private ImageView oq;
        private Bitmap.Config rhi;
        private int rjo;
        private syt sns;
        private String suf;
        private int syt;
        private gm ubx;
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
            return new bob(this).mq();
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public dgq kq(ImageView imageView) {
            this.oq = imageView;
            return new bob(this).mq();
        }

        @Override // com.bytedance.sdk.component.csi.nn
        public nn kq(syt sytVar) {
            this.sns = sytVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dgq mq() {
        try {
            if (this.jhe == null) {
                mxq mxqVar = this.csi;
                if (mxqVar != null) {
                    mxqVar.kq(1005, "not init !", null);
                    return this;
                }
            } else {
                String strKq = kq();
                if (TextUtils.isEmpty(strKq)) {
                    this.csi.kq(2000, "url is empty", null);
                    return this;
                }
                mq mqVarRhi = this.jhe.rhi();
                if (!strKq.startsWith("http://") && !strKq.startsWith("https://") && mqVarRhi != null) {
                    mqVarRhi.kq(1006, "url is not validate ".concat(strKq));
                }
                ExecutorService executorServiceCsi = this.ebt == null ? this.jhe.csi() : null;
                Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.csi.fou.bob.bob.1
                    @Override // java.lang.Runnable
                    public void run() {
                        bob bobVar = bob.this;
                        com.bytedance.sdk.component.csi.fou.bob.kq kqVar = new com.bytedance.sdk.component.csi.fou.bob.kq(bobVar, bobVar.mxq);
                        try {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new com.bytedance.sdk.component.csi.fou.oq.oq());
                            arrayList.add(new com.bytedance.sdk.component.csi.fou.oq.csi());
                            arrayList.add(new com.bytedance.sdk.component.csi.fou.oq.kq());
                            arrayList.add(new com.bytedance.sdk.component.csi.fou.oq.bob());
                            arrayList.add(new com.bytedance.sdk.component.csi.fou.oq.fou());
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                if (bob.this.wki) {
                                    kqVar.kq(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, "canceled", null);
                                    return;
                                }
                                com.bytedance.sdk.component.csi.fou.oq.rhi rhiVar = (com.bytedance.sdk.component.csi.fou.oq.rhi) arrayList.get(i10);
                                if (bob.this.mxq != null && rhiVar != null && !"data_intercept".equals(rhiVar.kq())) {
                                    bob.this.mxq.kq(rhiVar.kq(), bob.this);
                                }
                                bob bobVar2 = bob.this;
                                boolean zKq = rhiVar.kq(bobVar2, bobVar2.mxq, kqVar);
                                if (bob.this.mxq != null && !"data_intercept".equals(rhiVar.kq())) {
                                    bob.this.mxq.oq(rhiVar.kq(), bob.this);
                                }
                                if (!zKq) {
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            kqVar.kq(2000, th.getMessage(), th);
                        }
                    }
                };
                if (this.ibd) {
                    runnable.run();
                    return this;
                }
                ExecutorService executorService = this.ebt;
                if (executorService != null) {
                    this.kq = executorService.submit(runnable);
                    return this;
                }
                if (executorServiceCsi != null) {
                    this.kq = executorServiceCsi.submit(runnable);
                }
            }
            return this;
        } catch (Exception e10) {
            Log.e("ImageRequest", e10.getMessage());
            return this;
        }
    }

    public String fax() {
        return nn() + vvw();
    }

    public suf gm() {
        return this.rs;
    }

    public int mxq() {
        return this.mq;
    }

    public String nn() {
        return this.bob;
    }

    public com.bytedance.sdk.component.csi.rjo nze() {
        return this.fax;
    }

    public rhi sns() {
        return this.jhe;
    }

    public byte[] suf() {
        return this.ha;
    }

    public Bitmap.Config ubx() {
        return this.rjo;
    }

    public int vvw() {
        return this.ubx;
    }

    public com.bytedance.sdk.component.csi.oq wcx() {
        return this.uml;
    }

    public boolean wki() {
        return this.gm;
    }

    private bob(oq oqVar) {
        this.wcx = new Handler(Looper.getMainLooper());
        this.gm = true;
        this.ha = null;
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
        this.uml = kq(oqVar);
        if (!TextUtils.isEmpty(oqVar.bob)) {
            oq(oqVar.bob);
            kq(oqVar.bob);
        }
        this.suf = oqVar.vvw;
        this.nze = oqVar.wki;
        this.jhe = oqVar.mxq;
        this.nn = oqVar.sns;
        this.ou = oqVar.gm;
        this.nb = oqVar.wcx;
        this.ebt = oqVar.fax;
        this.ibd = oqVar.mq;
        this.rs = oqVar.jhe;
    }

    private com.bytedance.sdk.component.csi.oq kq(oq oqVar) {
        if (oqVar.nze != null) {
            return oqVar.nze;
        }
        return !TextUtils.isEmpty(oqVar.suf) ? com.bytedance.sdk.component.csi.fou.bob.kq.oq.kq(new File(oqVar.suf)) : com.bytedance.sdk.component.csi.fou.bob.kq.oq.nn();
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

    public void oq(String str) {
        WeakReference<ImageView> weakReference = this.vvw;
        if (weakReference != null && weakReference.get() != null) {
            this.vvw.get().setTag(1094453505, str);
        }
        this.bob = str;
    }

    public int rhi() {
        return this.nb;
    }

    public int rjo() {
        return this.ou;
    }

    public mxq syt() {
        return this.csi;
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
        this.gm = z9;
    }

    public void kq(byte[] bArr) {
        this.ha = bArr;
    }

    public void kq(int i10) {
        this.mq = i10;
    }
}
