package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f15658f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f15659g = w.class.getSimpleName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final N.e f15660h = new N.e(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MotionEvent f15661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f15662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f15663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f15664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f15665e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w a(int i10, int i11, y yVar, MotionEvent motionEvent, long j10, float f10, float f11, x touchEventCoalescingKeyHelper) {
            Intrinsics.checkNotNullParameter(touchEventCoalescingKeyHelper, "touchEventCoalescingKeyHelper");
            w wVar = (w) w.f15660h.b();
            if (wVar == null) {
                wVar = new w(null);
            }
            w wVar2 = wVar;
            Object objC = p004a3.a.c(motionEvent);
            Intrinsics.checkNotNullExpressionValue(objC, "assertNotNull(...)");
            wVar2.h(i10, i11, yVar, (MotionEvent) objC, j10, f10, f11, touchEventCoalescingKeyHelper);
            return wVar2;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15666a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15666a = iArr;
        }
    }

    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(int i10, int i11, y yVar, MotionEvent motionEvent, long j10, float f10, float f11, x xVar) {
        super.init(i10, i11, motionEvent.getEventTime());
        short sB = 0;
        SoftAssertions.assertCondition(j10 != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            xVar.a(j10);
        } else if (action == 1) {
            xVar.e(j10);
        } else if (action == 2) {
            sB = xVar.b(j10);
        } else if (action == 3) {
            xVar.e(j10);
        } else if (action == 5 || action == 6) {
            xVar.d(j10);
        }
        this.f15661a = MotionEvent.obtain(motionEvent);
        this.f15662b = yVar;
        this.f15663c = sB;
        this.f15664d = f10;
        this.f15665e = f11;
    }

    private final boolean i() {
        if (this.f15661a != null) {
            return true;
        }
        String TAG = f15659g;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        return false;
    }

    @Override // com.facebook.react.uimanager.events.e
    public boolean canCoalesce() {
        y yVar = (y) p004a3.a.c(this.f15662b);
        int i10 = yVar == null ? -1 : b.f15666a[yVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.f15662b);
    }

    public final MotionEvent d() {
        Object objC = p004a3.a.c(this.f15661a);
        Intrinsics.checkNotNullExpressionValue(objC, "assertNotNull(...)");
        return (MotionEvent) objC;
    }

    @Override // com.facebook.react.uimanager.events.e
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (i()) {
            z.d(rctEventEmitter, this);
        }
    }

    @Override // com.facebook.react.uimanager.events.e
    public void dispatchModern(RCTModernEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (i()) {
            int iB = P3.a.b(getViewTag(), getSurfaceId());
            if (iB == 1) {
                z.d(rctEventEmitter, this);
            } else {
                if (iB != 2) {
                    return;
                }
                z.c(rctEventEmitter, this);
            }
        }
    }

    public final y e() {
        Object objC = p004a3.a.c(this.f15662b);
        Intrinsics.checkNotNullExpressionValue(objC, "assertNotNull(...)");
        return (y) objC;
    }

    public final float f() {
        return this.f15664d;
    }

    public final float g() {
        return this.f15665e;
    }

    @Override // com.facebook.react.uimanager.events.e
    public short getCoalescingKey() {
        return this.f15663c;
    }

    @Override // com.facebook.react.uimanager.events.e
    public int getEventCategory() {
        y yVar = this.f15662b;
        if (yVar == null) {
            return 2;
        }
        int i10 = b.f15666a[yVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2 || i10 == 3) {
            return 1;
        }
        if (i10 == 4) {
            return 4;
        }
        throw new p129m8.k();
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        y.a aVar = y.f15668b;
        Object objC = p004a3.a.c(this.f15662b);
        Intrinsics.checkNotNullExpressionValue(objC, "assertNotNull(...)");
        return aVar.a((y) objC);
    }

    @Override // com.facebook.react.uimanager.events.e
    public void onDispose() {
        MotionEvent motionEvent = this.f15661a;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.f15661a = null;
        try {
            f15660h.a(this);
        } catch (IllegalStateException e10) {
            String TAG = f15659g;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ReactSoftExceptionLogger.logSoftException(TAG, e10);
        }
    }

    private w() {
    }
}
