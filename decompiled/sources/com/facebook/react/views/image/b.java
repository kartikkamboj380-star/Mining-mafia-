package com.facebook.react.views.image;

import app.notifee.core.event.LogEvent;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.horcrux.svg.events.SvgLoadEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends com.facebook.react.uimanager.events.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f15886h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f15891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f15892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f15893g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(int i10, int i11, Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new b(i10, i11, 1, throwable.getMessage(), null, 0, 0, 0, 0, null);
        }

        public final b b(int i10, int i11) {
            return new b(i10, i11, 3, null, null, 0, 0, 0, 0, PglCryptUtils.BASE64_FAILED, null);
        }

        public final b c(int i10, int i11, String str, int i12, int i13) {
            return new b(i10, i11, 2, null, str, i12, i13, 0, 0, null);
        }

        public final b d(int i10, int i11) {
            return new b(i10, i11, 4, null, null, 0, 0, 0, 0, PglCryptUtils.BASE64_FAILED, null);
        }

        public final b e(int i10, int i11, String str, int i12, int i13) {
            return new b(i10, i11, 5, null, str, 0, 0, i12, i13, null);
        }

        public final String f(int i10) {
            if (i10 == 1) {
                return "topError";
            }
            if (i10 == 2) {
                return SvgLoadEvent.EVENT_NAME;
            }
            if (i10 == 3) {
                return "topLoadEnd";
            }
            if (i10 == 4) {
                return "topLoadStart";
            }
            if (i10 == 5) {
                return "topProgress";
            }
            throw new IllegalStateException(("Invalid image event: " + i10).toString());
        }

        private a() {
        }
    }

    public /* synthetic */ b(int i10, int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, str, str2, i13, i14, i15, i16);
    }

    private final WritableMap b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putString("uri", this.f15889c);
        writableMapCreateMap.putDouble("width", this.f15890d);
        writableMapCreateMap.putDouble("height", this.f15891e);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.e
    public short getCoalescingKey() {
        return (short) this.f15887a;
    }

    @Override // com.facebook.react.uimanager.events.e
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        int i10 = this.f15887a;
        if (i10 == 1) {
            writableMapCreateMap.putString(LogEvent.LEVEL_ERROR, this.f15888b);
            return writableMapCreateMap;
        }
        if (i10 == 2) {
            writableMapCreateMap.putMap("source", b());
            return writableMapCreateMap;
        }
        if (i10 != 5) {
            return writableMapCreateMap;
        }
        writableMapCreateMap.putInt("loaded", this.f15892f);
        writableMapCreateMap.putInt("total", this.f15893g);
        writableMapCreateMap.putDouble(ReactProgressBarViewManager.PROP_PROGRESS, ((double) this.f15892f) / ((double) this.f15893g));
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.e
    public String getEventName() {
        return f15886h.f(this.f15887a);
    }

    /* synthetic */ b(int i10, int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, (i17 & 8) != 0 ? null : str, (i17 & 16) != 0 ? null : str2, (i17 & 32) != 0 ? 0 : i13, (i17 & 64) != 0 ? 0 : i14, (i17 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? 0 : i15, (i17 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0 : i16);
    }

    private b(int i10, int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16) {
        super(i10, i11);
        this.f15887a = i12;
        this.f15888b = str;
        this.f15889c = str2;
        this.f15890d = i13;
        this.f15891e = i14;
        this.f15892f = i15;
        this.f15893g = i16;
    }
}
