package p164q3;

import com.facebook.react.bridge.ReadableArray;
import kotlin.jvm.internal.Intrinsics;
import p154p3.c;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f48045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ReadableArray f48046e;

    public d(int i10, int i11, int i12, ReadableArray commandArgs) {
        Intrinsics.checkNotNullParameter(commandArgs, "commandArgs");
        this.f48043b = i10;
        this.f48044c = i11;
        this.f48045d = i12;
        this.f48046e = commandArgs;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(c mountingManager) {
        Intrinsics.checkNotNullParameter(mountingManager, "mountingManager");
        mountingManager.n(this.f48043b, this.f48044c, this.f48045d, this.f48046e);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.f48043b;
    }

    public String toString() {
        return "DispatchIntCommandMountItem [" + this.f48044c + "] " + this.f48045d;
    }
}
