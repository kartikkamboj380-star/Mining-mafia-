package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends com.facebook.react.uimanager.events.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f42678c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.th3rdwave.safeareacontext.a f42679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f42680b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, int i11, com.th3rdwave.safeareacontext.a mInsets, c mFrame) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(mInsets, "mInsets");
        Intrinsics.checkNotNullParameter(mFrame, "mFrame");
        this.f42679a = mInsets;
        this.f42680b = mFrame;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putMap("insets", q.b(this.f42679a));
        writableMapCreateMap.putMap("frame", q.d(this.f42680b));
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topInsetsChange";
    }
}
