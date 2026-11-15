package com.bytedance.adsdk.oq.bob.bob;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.adsdk.oq.bob.oq.suf;
import com.bytedance.adsdk.oq.kq.oq.mxq;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq implements com.bytedance.adsdk.oq.kq.kq.csi, com.bytedance.adsdk.oq.kq.oq.kq.InterfaceC0222kq {
    final csi bob;
    float csi;
    private final List<com.bytedance.adsdk.oq.kq.oq.kq<?, ?>> ebt;
    private final String fax;
    private final Matrix fgm;
    final mxq fou;
    private final RectF gm;
    private Paint ha;
    private boolean ibd;
    private com.bytedance.adsdk.oq.kq.oq.fou jhe;
    final Matrix kq;
    private com.bytedance.adsdk.oq.kq.oq.syt mq;
    private final RectF mxq;
    private kq nb;
    private final RectF nze;
    final com.bytedance.adsdk.oq.dgq oq;
    private List<kq> ou;
    BlurMaskFilter rhi;
    private boolean rs;
    private final RectF sns;
    private final Paint suf;
    private final Paint ubx;
    private kq uml;
    private final Paint vvw;
    private final RectF wcx;
    private final Paint wki;
    private float zfx;
    private final Path rjo = new Path();
    private final Matrix syt = new Matrix();
    private final Matrix dgq = new Matrix();
    private final Paint nn = new com.bytedance.adsdk.oq.kq.kq(1);

    /* JADX INFO: renamed from: com.bytedance.adsdk.oq.bob.bob.kq$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] kq;
        static final /* synthetic */ int[] oq;

        static {
            int[] iArr = new int[com.bytedance.adsdk.oq.bob.oq.syt.kq.values().length];
            oq = iArr;
            try {
                iArr[com.bytedance.adsdk.oq.bob.oq.syt.kq.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                oq[com.bytedance.adsdk.oq.bob.oq.syt.kq.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                oq[com.bytedance.adsdk.oq.bob.oq.syt.kq.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                oq[com.bytedance.adsdk.oq.bob.oq.syt.kq.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[csi.kq.values().length];
            kq = iArr2;
            try {
                iArr2[csi.kq.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                kq[csi.kq.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                kq[csi.kq.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                kq[csi.kq.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                kq[csi.kq.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                kq[csi.kq.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                kq[csi.kq.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    kq(com.bytedance.adsdk.oq.dgq dgqVar, csi csiVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.ubx = new com.bytedance.adsdk.oq.kq.kq(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.vvw = new com.bytedance.adsdk.oq.kq.kq(1, mode2);
        com.bytedance.adsdk.oq.kq.kq kqVar = new com.bytedance.adsdk.oq.kq.kq(1);
        this.wki = kqVar;
        this.suf = new com.bytedance.adsdk.oq.kq.kq(PorterDuff.Mode.CLEAR);
        this.nze = new RectF();
        this.mxq = new RectF();
        this.sns = new RectF();
        this.wcx = new RectF();
        this.gm = new RectF();
        this.kq = new Matrix();
        this.ebt = new ArrayList();
        this.ibd = true;
        this.csi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.fgm = new Matrix();
        this.zfx = 1.0f;
        this.oq = dgqVar;
        this.bob = csiVar;
        this.fax = csiVar.rhi() + "#draw";
        if (csiVar.vvw() == csi.oq.INVERT) {
            kqVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            kqVar.setXfermode(new PorterDuffXfermode(mode));
        }
        mxq mxqVarNn = csiVar.nze().nn();
        this.fou = mxqVarNn;
        mxqVarNn.kq((com.bytedance.adsdk.oq.kq.oq.kq.InterfaceC0222kq) this);
        if (csiVar.nn() != null && !csiVar.nn().isEmpty()) {
            com.bytedance.adsdk.oq.kq.oq.syt sytVar = new com.bytedance.adsdk.oq.kq.oq.syt(csiVar.nn());
            this.mq = sytVar;
            Iterator<com.bytedance.adsdk.oq.kq.oq.kq<suf, Path>> it = sytVar.oq().iterator();
            while (it.hasNext()) {
                it.next().kq(this);
            }
            for (com.bytedance.adsdk.oq.kq.oq.kq<Integer, Integer> kqVar2 : this.mq.bob()) {
                kq(kqVar2);
                kqVar2.kq(this);
            }
        }
        vvw();
    }

    private void nze() {
        if (this.ou != null) {
            return;
        }
        if (this.nb == null) {
            this.ou = Collections.EMPTY_LIST;
            return;
        }
        this.ou = new ArrayList();
        for (kq kqVar = this.nb; kqVar != null; kqVar = kqVar.nb) {
            this.ou.add(kqVar);
        }
    }

    private boolean suf() {
        if (this.mq.oq().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.mq.kq().size(); i10++) {
            if (this.mq.kq().get(i10).kq() != com.bytedance.adsdk.oq.bob.oq.syt.kq.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void vvw() {
        if (this.bob.fou().isEmpty()) {
            oq(true);
            return;
        }
        com.bytedance.adsdk.oq.kq.oq.fou fouVar = new com.bytedance.adsdk.oq.kq.oq.fou(this.bob.fou());
        this.jhe = fouVar;
        fouVar.kq();
        this.jhe.kq(new com.bytedance.adsdk.oq.kq.oq.kq.InterfaceC0222kq() { // from class: com.bytedance.adsdk.oq.bob.bob.kq.1
            @Override // com.bytedance.adsdk.oq.kq.oq.kq.InterfaceC0222kq
            public void kq() {
                kq kqVar = kq.this;
                kqVar.oq(kqVar.jhe.dgq() == 1.0f);
            }
        });
        oq(this.jhe.rjo().floatValue() == 1.0f);
        kq(this.jhe);
    }

    private void wki() {
        this.oq.invalidateSelf();
    }

    public String csi() {
        csi csiVar = this.bob;
        if (csiVar != null) {
            return csiVar.rjo();
        }
        return null;
    }

    public String dgq() {
        return this.bob.rhi();
    }

    public Matrix fou() {
        return this.fgm;
    }

    @Override // com.bytedance.adsdk.oq.kq.kq.bob
    public void kq(List<com.bytedance.adsdk.oq.kq.kq.bob> list, List<com.bytedance.adsdk.oq.kq.kq.bob> list2) {
    }

    public com.bytedance.adsdk.oq.bob.oq.kq nn() {
        return this.bob.uml();
    }

    csi oq() {
        return this.bob;
    }

    public float rhi() {
        return this.zfx;
    }

    boolean rjo() {
        com.bytedance.adsdk.oq.kq.oq.syt sytVar = this.mq;
        return (sytVar == null || sytVar.oq().isEmpty()) ? false : true;
    }

    public boolean syt() {
        return this.ibd;
    }

    public com.bytedance.adsdk.oq.csi.nn ubx() {
        return this.bob.nb();
    }

    private void fou(Canvas canvas, Matrix matrix, com.bytedance.adsdk.oq.kq.oq.kq<suf, Path> kqVar, com.bytedance.adsdk.oq.kq.oq.kq<Integer, Integer> kqVar2) {
        com.bytedance.adsdk.oq.rhi.rhi.kq(canvas, this.nze, this.ubx);
        this.rjo.set(kqVar.rjo());
        this.rjo.transform(matrix);
        this.nn.setAlpha((int) (kqVar2.rjo().intValue() * 2.55f));
        canvas.drawPath(this.rjo, this.nn);
        canvas.restore();
    }

    boolean bob() {
        return this.uml != null;
    }

    void oq(kq kqVar) {
        this.nb = kqVar;
    }

    private void bob(float f10) {
        this.oq.ebt().bob().kq(this.bob.rhi(), f10);
    }

    private void csi(Canvas canvas, Matrix matrix, com.bytedance.adsdk.oq.kq.oq.kq<suf, Path> kqVar, com.bytedance.adsdk.oq.kq.oq.kq<Integer, Integer> kqVar2) {
        com.bytedance.adsdk.oq.rhi.rhi.kq(canvas, this.nze, this.ubx);
        canvas.drawRect(this.nze, this.nn);
        this.vvw.setAlpha((int) (kqVar2.rjo().intValue() * 2.55f));
        this.rjo.set(kqVar.rjo());
        this.rjo.transform(matrix);
        canvas.drawPath(this.rjo, this.vvw);
        canvas.restore();
    }

    static kq kq(oq oqVar, csi csiVar, com.bytedance.adsdk.oq.dgq dgqVar, com.bytedance.adsdk.oq.rjo rjoVar, Context context) {
        switch (AnonymousClass2.kq[csiVar.ubx().ordinal()]) {
            case 1:
                return new rjo(dgqVar, csiVar, oqVar, rjoVar);
            case 2:
                return new oq(dgqVar, csiVar, rjoVar.oq(csiVar.rjo()), rjoVar, context);
            case 3:
                return new syt(dgqVar, csiVar);
            case 4:
                if (kq(dgqVar, csiVar, "text:")) {
                    return new bob(dgqVar, csiVar, context);
                }
                if (kq(dgqVar, csiVar, "videoview:")) {
                    return new nn(dgqVar, csiVar, context);
                }
                return new fou(dgqVar, csiVar);
            case 5:
                return new rhi(dgqVar, csiVar);
            case 6:
                return new dgq(dgqVar, csiVar);
            default:
                Objects.toString(csiVar.ubx());
                return null;
        }
    }

    private void oq(RectF rectF, Matrix matrix) {
        if (bob() && this.bob.vvw() != csi.oq.INVERT) {
            this.wcx.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.uml.kq(this.wcx, matrix, true);
            if (rectF.intersect(this.wcx)) {
                return;
            }
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private void bob(Canvas canvas, Matrix matrix, com.bytedance.adsdk.oq.kq.oq.kq<suf, Path> kqVar, com.bytedance.adsdk.oq.kq.oq.kq<Integer, Integer> kqVar2) {
        com.bytedance.adsdk.oq.rhi.rhi.kq(canvas, this.nze, this.vvw);
        canvas.drawRect(this.nze, this.nn);
        this.vvw.setAlpha((int) (kqVar2.rjo().intValue() * 2.55f));
        this.rjo.set(kqVar.rjo());
        this.rjo.transform(matrix);
        canvas.drawPath(this.rjo, this.vvw);
        canvas.restore();
    }

    public void oq(Canvas canvas, Matrix matrix, int i10) {
        kq(i10);
    }

    private void oq(Canvas canvas, Matrix matrix, com.bytedance.adsdk.oq.kq.oq.kq<suf, Path> kqVar, com.bytedance.adsdk.oq.kq.oq.kq<Integer, Integer> kqVar2) {
        com.bytedance.adsdk.oq.rhi.rhi.kq(canvas, this.nze, this.nn);
        canvas.drawRect(this.nze, this.nn);
        this.rjo.set(kqVar.rjo());
        this.rjo.transform(matrix);
        this.nn.setAlpha((int) (kqVar2.rjo().intValue() * 2.55f));
        canvas.drawPath(this.rjo, this.vvw);
        canvas.restore();
    }

    private static boolean kq(com.bytedance.adsdk.oq.dgq dgqVar, csi csiVar, String str) {
        com.bytedance.adsdk.oq.nn nnVarRhi;
        if (dgqVar == null || csiVar == null || str == null || (nnVarRhi = dgqVar.rhi(csiVar.rjo())) == null) {
            return false;
        }
        return str.equals(nnVarRhi.nn());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oq(boolean z9) {
        if (z9 != this.ibd) {
            this.ibd = z9;
            wki();
        }
    }

    void kq(boolean z9) {
        if (z9 && this.ha == null) {
            this.ha = new com.bytedance.adsdk.oq.kq.kq();
        }
        this.rs = z9;
    }

    @Override // com.bytedance.adsdk.oq.kq.oq.kq.InterfaceC0222kq
    public void kq() {
        wki();
    }

    public BlurMaskFilter oq(float f10) {
        if (this.csi == f10) {
            return this.rhi;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.rhi = blurMaskFilter;
        this.csi = f10;
        return blurMaskFilter;
    }

    void kq(kq kqVar) {
        this.uml = kqVar;
    }

    public void kq(com.bytedance.adsdk.oq.kq.oq.kq<?, ?> kqVar) {
        if (kqVar == null) {
            return;
        }
        this.ebt.add(kqVar);
    }

    @Override // com.bytedance.adsdk.oq.kq.kq.csi
    public void kq(RectF rectF, Matrix matrix, boolean z9) {
        this.nze.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        nze();
        this.kq.set(matrix);
        if (z9) {
            List<kq> list = this.ou;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.kq.preConcat(this.ou.get(size).fou.fou());
                }
            } else {
                kq kqVar = this.nb;
                if (kqVar != null) {
                    this.kq.preConcat(kqVar.fou.fou());
                }
            }
        }
        this.kq.preConcat(this.fou.fou());
    }

    @Override // com.bytedance.adsdk.oq.kq.kq.csi
    public void kq(Canvas canvas, Matrix matrix, int i10) {
        Paint paint;
        Integer numRjo;
        com.bytedance.adsdk.oq.csi.kq(this.fax);
        if (this.ibd && !this.bob.jhe()) {
            nze();
            com.bytedance.adsdk.oq.csi.kq("Layer#parentMatrix");
            this.fgm.set(matrix);
            this.syt.reset();
            this.syt.set(matrix);
            for (int size = this.ou.size() - 1; size >= 0; size--) {
                this.syt.preConcat(this.ou.get(size).fou.fou());
            }
            com.bytedance.adsdk.oq.csi.oq("Layer#parentMatrix");
            com.bytedance.adsdk.oq.kq.oq.kq<?, Integer> kqVarKq = this.fou.kq();
            int iIntValue = (int) ((((i10 / 255.0f) * ((kqVarKq == null || (numRjo = kqVarKq.rjo()) == null) ? 100 : numRjo.intValue())) / 100.0f) * 255.0f);
            if (!bob() && !rjo()) {
                this.syt.preConcat(this.fou.fou());
                com.bytedance.adsdk.oq.csi.kq("Layer#drawLayer");
                oq(canvas, this.syt, iIntValue);
                com.bytedance.adsdk.oq.csi.oq("Layer#drawLayer");
                bob(com.bytedance.adsdk.oq.csi.oq(this.fax));
                return;
            }
            com.bytedance.adsdk.oq.csi.kq("Layer#computeBounds");
            kq(this.nze, this.syt, false);
            oq(this.nze, matrix);
            this.syt.preConcat(this.fou.fou());
            kq(this.nze, this.syt);
            this.mxq.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.dgq);
            if (!this.dgq.isIdentity()) {
                Matrix matrix2 = this.dgq;
                matrix2.invert(matrix2);
                this.dgq.mapRect(this.mxq);
            }
            if (!this.nze.intersect(this.mxq)) {
                this.nze.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            com.bytedance.adsdk.oq.csi.oq("Layer#computeBounds");
            if (this.nze.width() >= 1.0f && this.nze.height() >= 1.0f) {
                com.bytedance.adsdk.oq.csi.kq("Layer#saveLayer");
                this.nn.setAlpha(255);
                com.bytedance.adsdk.oq.rhi.rhi.kq(canvas, this.nze, this.nn);
                com.bytedance.adsdk.oq.csi.oq("Layer#saveLayer");
                kq(canvas);
                com.bytedance.adsdk.oq.csi.kq("Layer#drawLayer");
                oq(canvas, this.syt, iIntValue);
                com.bytedance.adsdk.oq.csi.oq("Layer#drawLayer");
                if (rjo()) {
                    kq(canvas, this.syt);
                }
                if (bob()) {
                    com.bytedance.adsdk.oq.csi.kq("Layer#drawMatte");
                    com.bytedance.adsdk.oq.csi.kq("Layer#saveLayer");
                    com.bytedance.adsdk.oq.rhi.rhi.kq(canvas, this.nze, this.wki, 19);
                    com.bytedance.adsdk.oq.csi.oq("Layer#saveLayer");
                    kq(canvas);
                    this.uml.kq(canvas, matrix, iIntValue);
                    com.bytedance.adsdk.oq.csi.kq("Layer#restoreLayer");
                    canvas.restore();
                    com.bytedance.adsdk.oq.csi.oq("Layer#restoreLayer");
                    com.bytedance.adsdk.oq.csi.oq("Layer#drawMatte");
                }
                com.bytedance.adsdk.oq.csi.kq("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.oq.csi.oq("Layer#restoreLayer");
            }
            if (this.rs && (paint = this.ha) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.ha.setColor(-251901);
                this.ha.setStrokeWidth(4.0f);
                canvas.drawRect(this.nze, this.ha);
                this.ha.setStyle(Paint.Style.FILL);
                this.ha.setColor(1357638635);
                canvas.drawRect(this.nze, this.ha);
            }
            bob(com.bytedance.adsdk.oq.csi.oq(this.fax));
            return;
        }
        com.bytedance.adsdk.oq.csi.oq(this.fax);
    }

    private void kq(Canvas canvas) {
        com.bytedance.adsdk.oq.csi.kq("Layer#clearLayer");
        RectF rectF = this.nze;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.suf);
        com.bytedance.adsdk.oq.csi.oq("Layer#clearLayer");
    }

    private void kq(RectF rectF, Matrix matrix) {
        this.sns.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (rjo()) {
            int size = this.mq.kq().size();
            for (int i10 = 0; i10 < size; i10++) {
                com.bytedance.adsdk.oq.bob.oq.syt sytVar = this.mq.kq().get(i10);
                Path pathRjo = this.mq.oq().get(i10).rjo();
                if (pathRjo != null) {
                    this.rjo.set(pathRjo);
                    this.rjo.transform(matrix);
                    int i11 = AnonymousClass2.oq[sytVar.kq().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && sytVar.fou()) {
                        return;
                    }
                    this.rjo.computeBounds(this.gm, false);
                    if (i10 == 0) {
                        this.sns.set(this.gm);
                    } else {
                        RectF rectF2 = this.sns;
                        rectF2.set(Math.min(rectF2.left, this.gm.left), Math.min(this.sns.top, this.gm.top), Math.max(this.sns.right, this.gm.right), Math.max(this.sns.bottom, this.gm.bottom));
                    }
                }
            }
            if (rectF.intersect(this.sns)) {
                return;
            }
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    protected void kq(int i10) {
        this.zfx = ((this.fou.kq() != null ? this.fou.kq().rjo().intValue() : 100) / 100.0f) * (i10 / 255.0f);
    }

    private void kq(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.oq.csi.kq("Layer#saveLayer");
        com.bytedance.adsdk.oq.rhi.rhi.kq(canvas, this.nze, this.ubx, 19);
        if (Build.VERSION.SDK_INT < 28) {
            kq(canvas);
        }
        com.bytedance.adsdk.oq.csi.oq("Layer#saveLayer");
        for (int i10 = 0; i10 < this.mq.kq().size(); i10++) {
            com.bytedance.adsdk.oq.bob.oq.syt sytVar = this.mq.kq().get(i10);
            com.bytedance.adsdk.oq.kq.oq.kq<suf, Path> kqVar = this.mq.oq().get(i10);
            com.bytedance.adsdk.oq.kq.oq.kq<Integer, Integer> kqVar2 = this.mq.bob().get(i10);
            int i11 = AnonymousClass2.oq[sytVar.kq().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.nn.setColor(-16777216);
                        this.nn.setAlpha(255);
                        canvas.drawRect(this.nze, this.nn);
                    }
                    if (sytVar.fou()) {
                        bob(canvas, matrix, kqVar, kqVar2);
                    } else {
                        kq(canvas, matrix, kqVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (sytVar.fou()) {
                            oq(canvas, matrix, kqVar, kqVar2);
                        } else {
                            kq(canvas, matrix, kqVar, kqVar2);
                        }
                    }
                } else if (sytVar.fou()) {
                    csi(canvas, matrix, kqVar, kqVar2);
                } else {
                    fou(canvas, matrix, kqVar, kqVar2);
                }
            } else if (suf()) {
                this.nn.setAlpha(255);
                canvas.drawRect(this.nze, this.nn);
            }
        }
        com.bytedance.adsdk.oq.csi.kq("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.oq.csi.oq("Layer#restoreLayer");
    }

    private void kq(Canvas canvas, Matrix matrix, com.bytedance.adsdk.oq.kq.oq.kq<suf, Path> kqVar, com.bytedance.adsdk.oq.kq.oq.kq<Integer, Integer> kqVar2) {
        this.rjo.set(kqVar.rjo());
        this.rjo.transform(matrix);
        this.nn.setAlpha((int) (kqVar2.rjo().intValue() * 2.55f));
        canvas.drawPath(this.rjo, this.nn);
    }

    private void kq(Canvas canvas, Matrix matrix, com.bytedance.adsdk.oq.kq.oq.kq<suf, Path> kqVar) {
        this.rjo.set(kqVar.rjo());
        this.rjo.transform(matrix);
        canvas.drawPath(this.rjo, this.vvw);
    }

    void kq(float f10) {
        this.fou.kq(f10);
        if (this.mq != null) {
            for (int i10 = 0; i10 < this.mq.oq().size(); i10++) {
                this.mq.oq().get(i10).kq(f10);
            }
        }
        com.bytedance.adsdk.oq.kq.oq.fou fouVar = this.jhe;
        if (fouVar != null) {
            fouVar.kq(f10);
        }
        kq kqVar = this.uml;
        if (kqVar != null) {
            kqVar.kq(f10);
        }
        for (int i11 = 0; i11 < this.ebt.size(); i11++) {
            this.ebt.get(i11).kq(f10);
        }
    }
}
