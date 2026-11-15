package com.facebook.react.uimanager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.uimanager.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1354e0 extends com.facebook.react.uimanager.events.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15564e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final N.e f15565f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f15566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15569d;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.e0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1354e0 a(int i10, int i11, int i12, int i13, int i14, int i15) {
            C1354e0 c1354e0 = (C1354e0) C1354e0.f15565f.b();
            if (c1354e0 == null) {
                c1354e0 = new C1354e0(null);
            }
            C1354e0 c1354e1 = c1354e0;
            c1354e1.c(i10, i11, i12, i13, i14, i15);
            return c1354e1;
        }

        private a() {
        }
    }

    static {
        p064g3.b.a("OnLayoutEvent", p064g3.a.ERROR);
        f15565f = new N.e(20);
    }

    public /* synthetic */ C1354e0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final C1354e0 d(int i10, int i11, int i12, int i13, int i14, int i15) {
        return f15564e.a(i10, i11, i12, i13, i14, i15);
    }

    protected final void c(int i10, int i11, int i12, int i13, int i14, int i15) {
        super.init(i10, i11);
        this.f15566a = i12;
        this.f15567b = i13;
        this.f15568c = i14;
        this.f15569d = i15;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("x", C1356f0.g(this.f15566a));
        readableMapBuilder.put("y", C1356f0.g(this.f15567b));
        readableMapBuilder.put("width", C1356f0.g(this.f15568c));
        readableMapBuilder.put("height", C1356f0.g(this.f15569d));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("layout", writableMapCreateMap);
        writableMapCreateMap2.putInt("target", getViewTag());
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap2, "apply(...)");
        return writableMapCreateMap2;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topLayout";
    }

    @Override // com.facebook.react.uimanager.events.e
    public void onDispose() {
        f15565f.a(this);
    }

    private C1354e0() {
    }
}
