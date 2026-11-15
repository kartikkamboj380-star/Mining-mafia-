package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1159e implements InterfaceC1168n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1158d f10210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1168n f10211b;

    /* JADX INFO: renamed from: androidx.lifecycle.e$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10212a;

        static {
            int[] iArr = new int[AbstractC1164j.a.values().length];
            try {
                iArr[AbstractC1164j.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1164j.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1164j.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1164j.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1164j.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1164j.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1164j.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f10212a = iArr;
        }
    }

    public C1159e(InterfaceC1158d defaultLifecycleObserver, InterfaceC1168n interfaceC1168n) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f10210a = defaultLifecycleObserver;
        this.f10211b = interfaceC1168n;
    }

    @Override // androidx.lifecycle.InterfaceC1168n
    public void onStateChanged(r source, AbstractC1164j.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (a.f10212a[event.ordinal()]) {
            case 1:
                this.f10210a.c(source);
                break;
            case 2:
                this.f10210a.x(source);
                break;
            case 3:
                this.f10210a.j(source);
                break;
            case 4:
                this.f10210a.n(source);
                break;
            case 5:
                this.f10210a.v(source);
                break;
            case 6:
                this.f10210a.w(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1168n interfaceC1168n = this.f10211b;
        if (interfaceC1168n != null) {
            interfaceC1168n.onStateChanged(source, event);
        }
    }
}
