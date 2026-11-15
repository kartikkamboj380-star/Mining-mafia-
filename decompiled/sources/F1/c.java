package F1;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class c extends TextureView implements TextureView.SurfaceTextureListener, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f688a;

    public c(Context context) {
        this(context, null);
    }

    @Override // F1.e
    public void a(d dVar) {
        this.f688a = dVar;
        setSurfaceTextureListener(this);
    }

    @Override // F1.e
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // F1.e
    public void kq(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        d dVar = this.f688a;
        if (dVar != null) {
            dVar.kq(surfaceTexture, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        d dVar = this.f688a;
        if (dVar != null) {
            return dVar.kq(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        d dVar = this.f688a;
        if (dVar != null) {
            dVar.oq(surfaceTexture);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // F1.e
    public View getView() {
        return this;
    }

    public void setWindowVisibilityChangedListener(e.a aVar) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}
