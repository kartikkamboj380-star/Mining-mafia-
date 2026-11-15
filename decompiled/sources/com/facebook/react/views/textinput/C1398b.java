package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.views.textinput.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1398b extends com.facebook.react.uimanager.events.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16365c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f16366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f16367b;

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C1398b(int i10, int i11, float f10, float f11) {
        super(i10, i11);
        this.f16366a = f10;
        this.f16367b = f11;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("width", this.f16366a);
        readableMapBuilder.put("height", this.f16367b);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap2, "createMap(...)");
        writableMapCreateMap2.putMap("contentSize", writableMapCreateMap);
        writableMapCreateMap2.putInt("target", getViewTag());
        return writableMapCreateMap2;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topContentSizeChange";
    }
}
