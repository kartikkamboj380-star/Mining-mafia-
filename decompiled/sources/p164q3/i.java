package p164q3;

import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import kotlin.jvm.internal.Intrinsics;
import p154p3.c;

/* JADX INFO: loaded from: classes.dex */
public final class i implements MountItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f48063d = "Fabric.SendAccessibilityEvent";

    public i(int i10, int i11, int i12) {
        this.f48060a = i10;
        this.f48061b = i11;
        this.f48062c = i12;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(c mountingManager) {
        Intrinsics.checkNotNullParameter(mountingManager, "mountingManager");
        try {
            mountingManager.p(this.f48060a, this.f48061b, this.f48062c);
        } catch (RetryableMountingLayerException e10) {
            ReactSoftExceptionLogger.logSoftException(this.f48063d, new ReactNoCrashSoftException(e10));
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.f48060a;
    }

    public String toString() {
        return "SendAccessibilityEventMountItem [" + this.f48061b + "] " + this.f48062c;
    }
}
