package p164q3;

import com.facebook.react.fabric.mounting.mountitems.MountItem;
import kotlin.jvm.internal.Intrinsics;
import p154p3.c;
import p154p3.e;

/* JADX INFO: loaded from: classes.dex */
public final class b implements MountItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48041b;

    public b(int i10, int i11) {
        this.f48040a = i10;
        this.f48041b = i11;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(c mountingManager) {
        Intrinsics.checkNotNullParameter(mountingManager, "mountingManager");
        e eVarF = mountingManager.f(this.f48040a);
        if (eVarF == null) {
            return;
        }
        eVarF.k(this.f48041b);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.f48040a;
    }
}
