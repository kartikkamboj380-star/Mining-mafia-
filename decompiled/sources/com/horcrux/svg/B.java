package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class B extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ReadableMap f41297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C6794z f41298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f41299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Canvas f41300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f41301e;

    public B(ReactContext reactContext) {
        super(reactContext);
        this.f41301e = new Paint(1);
    }

    private static Object C(Object obj) {
        obj.getClass();
        return obj;
    }

    void A() {
        z().n();
    }

    void B() {
        z().o(this, this.f41297a);
    }

    public void D(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Map) {
            this.f41297a = dynamic.asMap();
        } else {
            this.f41297a = null;
        }
        invalidate();
    }

    public void E(ReadableMap readableMap) {
        this.f41297a = readableMap;
        invalidate();
    }

    void F(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        this.f41298b = new C6794z(this.mScale, rectF.width(), rectF.height());
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
        F(canvas);
        clip(canvas, paint);
        v(canvas, paint, f10);
        renderMarkers(canvas, paint, f10);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        this.mPath = new Path();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof G) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                this.mPath.addPath(virtualView.getPath(canvas, paint), virtualView.mMatrix);
            }
        }
        return this.mPath;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        int iReactTagForTouch;
        VirtualView virtualView;
        int iHitTest;
        if (!this.mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        int iRound = Math.round(fArr2[0]);
        int iRound2 = Math.round(fArr2[1]);
        Path clipPath = getClipPath();
        if (clipPath != null) {
            if (this.mClipRegionPath != clipPath) {
                this.mClipRegionPath = clipPath;
                RectF rectF = new RectF();
                this.mClipBounds = rectF;
                clipPath.computeBounds(rectF, true);
                this.mClipRegion = getRegion(clipPath, this.mClipBounds);
            }
            if (!this.mClipRegion.contains(iRound, iRound2)) {
                return -1;
            }
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof VirtualView) {
                if (!(childAt instanceof G) && (iHitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                    return (virtualView.isResponsible() || iHitTest != childAt.getId()) ? iHitTest : getId();
                }
            } else if ((childAt instanceof SvgView) && (iReactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                return iReactTagForTouch;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.RenderableView
    void resetProperties() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }

    void v(Canvas canvas, Paint paint, float f10) {
        B();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        if (this.mOpacity != 1.0f) {
            Bitmap bitmap = this.f41299c;
            if (bitmap == null) {
                this.f41299c = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f41300d = new Canvas(this.f41299c);
            } else {
                bitmap.recycle();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f41299c = bitmapCreateBitmap;
                this.f41300d.setBitmap(bitmapCreateBitmap);
            }
            this.f41300d.save();
            this.f41300d.setMatrix(canvas.getMatrix());
        } else {
            this.f41300d = canvas;
        }
        this.elements = new ArrayList<>();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof G)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!"none".equals(virtualView.mDisplay)) {
                        boolean z9 = virtualView instanceof RenderableView;
                        if (z9) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(this.f41300d, this.mCTM);
                        virtualView.render(this.f41300d, paint, f10);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(this.f41300d, iSaveAndSetupCanvas);
                        if (z9) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                        ArrayList<H> arrayList = virtualView.elements;
                        if (arrayList != null) {
                            this.elements.addAll(arrayList);
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                }
            }
        }
        if (this.mOpacity != 1.0f) {
            this.f41300d.restore();
            int iSave = canvas.save();
            canvas.setMatrix(null);
            this.f41301e.setAlpha((int) (this.mOpacity * 255.0f));
            Bitmap bitmap2 = this.f41299c;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f41301e);
            }
            canvas.restoreToCount(iSave);
        }
        setClientRect(rectF);
        A();
    }

    void w(Canvas canvas, Paint paint, float f10) {
        super.draw(canvas, paint, f10);
    }

    C6794z x() {
        return this.f41298b;
    }

    Path y(Canvas canvas, Paint paint, Region.Op op) {
        Path path = new Path();
        Path.Op opValueOf = Path.Op.valueOf(op.name());
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt instanceof G) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                Path pathY = virtualView instanceof B ? ((B) virtualView).y(canvas, paint, op) : virtualView.getPath(canvas, paint);
                pathY.transform(matrix);
                path.op(pathY, opValueOf);
            }
        }
        return path;
    }

    C6794z z() {
        return ((B) C(getTextRoot())).x();
    }
}
