package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends com.facebook.react.uimanager.events.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16340c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16342b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public E(int i10, int i11, int i12, int i13) {
        super(i10, i11);
        this.f16341a = i12;
        this.f16342b = i13;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("start", this.f16341a);
        readableMapBuilder.put("end", this.f16342b);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap2, "createMap(...)");
        writableMapCreateMap2.putMap("selection", writableMapCreateMap);
        return writableMapCreateMap2;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topSelectionChange";
    }
}
