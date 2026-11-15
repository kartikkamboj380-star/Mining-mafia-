package G2;

import android.graphics.Bitmap;
import p023c2.g;

/* JADX INFO: loaded from: classes.dex */
public class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f930a;

    private d() {
    }

    public static d b() {
        if (f930a == null) {
            f930a = new d();
        }
        return f930a;
    }

    @Override // p023c2.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
