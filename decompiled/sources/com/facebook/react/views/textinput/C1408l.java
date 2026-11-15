package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.views.textinput.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1408l extends com.facebook.react.uimanager.events.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f16422c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16424b;

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.l$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408l(int i10, int i11, String text, int i12) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(text, "text");
        this.f16423a = text;
        this.f16424b = i12;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putString("text", this.f16423a);
        writableMapCreateMap.putInt("eventCount", this.f16424b);
        writableMapCreateMap.putInt("target", getViewTag());
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topChange";
    }
}
