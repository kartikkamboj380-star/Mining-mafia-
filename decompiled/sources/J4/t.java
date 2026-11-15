package J4;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.InterfaceC1750Fw;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup.LayoutParams f2294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f2295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f2296d;

    public t(InterfaceC1750Fw interfaceC1750Fw) throws r {
        this.f2294b = interfaceC1750Fw.getLayoutParams();
        ViewParent parent = interfaceC1750Fw.getParent();
        this.f2296d = interfaceC1750Fw.C();
        if (!(parent instanceof ViewGroup)) {
            throw new r("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f2295c = viewGroup;
        this.f2293a = viewGroup.indexOfChild(interfaceC1750Fw.B());
        viewGroup.removeView(interfaceC1750Fw.B());
        interfaceC1750Fw.O0(true);
    }
}
