package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends com.facebook.react.uimanager.events.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16349b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16350a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(int i10, int i11, String text) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(text, "text");
        this.f16350a = text;
    }

    @Override // com.facebook.react.uimanager.events.e
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putString("text", this.f16350a);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return "topSubmitEditing";
    }
}
