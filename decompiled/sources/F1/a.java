package F1;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a extends b implements SurfaceHolder.Callback, e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ArrayList f685c = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference f686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f687b;

    public a(Context context) {
        super(context);
        b();
    }

    private void b() {
        f fVar = new f(this);
        this.f687b = fVar;
        f685c.add(fVar);
    }

    @Override // F1.e
    public void a(d dVar) {
        this.f686a = new WeakReference(dVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator it = f685c.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar != null && fVar.a() == null) {
                holder.removeCallback(fVar);
                it.remove();
            }
        }
        holder.addCallback(this.f687b);
    }

    @Override // F1.e
    public void kq(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        WeakReference weakReference = this.f686a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((d) this.f686a.get()).kq(surfaceHolder, i10, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.f686a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((d) this.f686a.get()).kq(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.f686a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((d) this.f686a.get()).oq(surfaceHolder);
    }

    @Override // F1.e
    public View getView() {
        return this;
    }

    public void setWindowVisibilityChangedListener(e.a aVar) {
    }
}
