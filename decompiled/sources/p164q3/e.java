package p164q3;

import com.facebook.react.bridge.ReadableArray;
import kotlin.jvm.internal.Intrinsics;
import p154p3.c;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f48049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ReadableArray f48050e;

    public e(int i10, int i11, String commandId, ReadableArray commandArgs) {
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        Intrinsics.checkNotNullParameter(commandArgs, "commandArgs");
        this.f48047b = i10;
        this.f48048c = i11;
        this.f48049d = commandId;
        this.f48050e = commandArgs;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(c mountingManager) {
        Intrinsics.checkNotNullParameter(mountingManager, "mountingManager");
        mountingManager.o(this.f48047b, this.f48048c, this.f48049d, this.f48050e);
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.f48047b;
    }

    public String toString() {
        return "DispatchStringCommandMountItem [" + this.f48048c + "] " + this.f48049d;
    }
}
