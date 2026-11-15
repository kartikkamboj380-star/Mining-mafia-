package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5872yR {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC5931yu0 f35351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC5931yu0 f35352e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC5746xR f35354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EnumC5746xR f35355c;

    static {
        EnumC5746xR enumC5746xR = EnumC5746xR.PUBLIC_API_CALL;
        EnumC5746xR enumC5746xR2 = EnumC5746xR.PUBLIC_API_CALLBACK;
        C5872yR c5872yR = new C5872yR("tqgt", enumC5746xR, enumC5746xR2);
        EnumC5746xR enumC5746xR3 = EnumC5746xR.DYNAMITE_ENTER;
        C5872yR c5872yR2 = new C5872yR("l.dl", enumC5746xR, enumC5746xR3);
        EnumC5746xR enumC5746xR4 = EnumC5746xR.READ_FROM_DISK_START;
        C5872yR c5872yR3 = new C5872yR("l.rccde", enumC5746xR3, enumC5746xR4);
        C5872yR c5872yR4 = new C5872yR("l.rfd", enumC5746xR4, EnumC5746xR.READ_FROM_DISK_END);
        EnumC5746xR enumC5746xR5 = EnumC5746xR.CLIENT_SIGNALS_START;
        C5872yR c5872yR5 = new C5872yR("l.rcc", enumC5746xR3, enumC5746xR5);
        EnumC5746xR enumC5746xR6 = EnumC5746xR.CLIENT_SIGNALS_END;
        C5872yR c5872yR6 = new C5872yR("l.cs", enumC5746xR5, enumC5746xR6);
        EnumC5746xR enumC5746xR7 = EnumC5746xR.SERVICE_CONNECTED;
        C5872yR c5872yR7 = new C5872yR("l.cts", enumC5746xR6, enumC5746xR7);
        EnumC5746xR enumC5746xR8 = EnumC5746xR.GMS_SIGNALS_START;
        EnumC5746xR enumC5746xR9 = EnumC5746xR.GMS_SIGNALS_END;
        C5872yR c5872yR8 = new C5872yR("l.gs", enumC5746xR8, enumC5746xR9);
        EnumC5746xR enumC5746xR10 = EnumC5746xR.GET_SIGNALS_SDKCORE_START;
        C5872yR c5872yR9 = new C5872yR("l.jse", enumC5746xR9, enumC5746xR10);
        EnumC5746xR enumC5746xR11 = EnumC5746xR.GET_SIGNALS_SDKCORE_END;
        C5872yR c5872yR10 = new C5872yR("l.gs-sdkcore", enumC5746xR10, enumC5746xR11);
        C5872yR c5872yR11 = new C5872yR("l.gs-pp", enumC5746xR11, enumC5746xR2);
        EnumC5746xR enumC5746xR12 = EnumC5746xR.RENDERING_START;
        C5872yR c5872yR12 = new C5872yR("l.render", enumC5746xR12, enumC5746xR2);
        EnumC5746xR enumC5746xR13 = EnumC5746xR.RENDERING_WEBVIEW_CREATION_START;
        C5872yR c5872yR13 = new C5872yR("l.render.pre", enumC5746xR12, enumC5746xR13);
        EnumC5746xR enumC5746xR14 = EnumC5746xR.RENDERING_WEBVIEW_CREATION_END;
        C5872yR c5872yR14 = new C5872yR("l.render.wvc", enumC5746xR13, enumC5746xR14);
        EnumC5746xR enumC5746xR15 = EnumC5746xR.RENDERING_AD_COMPONENT_CREATION_END;
        C5872yR c5872yR15 = new C5872yR("l.render.acc", enumC5746xR14, enumC5746xR15);
        EnumC5746xR enumC5746xR16 = EnumC5746xR.RENDERING_CONFIGURE_WEBVIEW_START;
        EnumC5746xR enumC5746xR17 = EnumC5746xR.RENDERING_CONFIGURE_WEBVIEW_END;
        C5872yR c5872yR16 = new C5872yR("l.render.cfg-wv", enumC5746xR16, enumC5746xR17);
        EnumC5746xR enumC5746xR18 = EnumC5746xR.RENDERING_WEBVIEW_LOAD_HTML_START;
        EnumC5746xR enumC5746xR19 = EnumC5746xR.RENDERING_WEBVIEW_LOAD_HTML_END;
        f35351d = AbstractC5931yu0.s(c5872yR, c5872yR2, c5872yR3, c5872yR4, c5872yR5, c5872yR6, c5872yR7, c5872yR8, c5872yR9, c5872yR10, c5872yR11, c5872yR12, c5872yR13, c5872yR14, c5872yR15, c5872yR16, new C5872yR("l.render.wvlh", enumC5746xR18, enumC5746xR19), new C5872yR("l.render.post", enumC5746xR19, enumC5746xR2), new C5872yR("l.sodv", EnumC5746xR.SIGNAL_ON_DISK_VALIDATION_START, EnumC5746xR.SIGNAL_ON_DISK_VALIDATION_END), new C5872yR("l.sodck", EnumC5746xR.SIGNAL_ON_DISK_CACHE_KEY_START, EnumC5746xR.SIGNAL_ON_DISK_CACHE_KEY_END), new C5872yR("l.sodrar", EnumC5746xR.SIGNAL_ON_DISK_READ_AND_REMOVE_START, EnumC5746xR.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new C5872yR("l.soddc", EnumC5746xR.SIGNAL_ON_DISK_DECODE_START, EnumC5746xR.SIGNAL_ON_DISK_DECODE_END));
        C5872yR c5872yR17 = new C5872yR("l.al", enumC5746xR, enumC5746xR2);
        C5872yR c5872yR18 = new C5872yR("l.al2", enumC5746xR3, enumC5746xR2);
        C5872yR c5872yR19 = new C5872yR("l.dl", enumC5746xR, enumC5746xR3);
        C5872yR c5872yR20 = new C5872yR("l.rcc", enumC5746xR3, enumC5746xR5);
        C5872yR c5872yR21 = new C5872yR("l.cs", enumC5746xR5, enumC5746xR6);
        C5872yR c5872yR22 = new C5872yR("l.cts", enumC5746xR6, enumC5746xR7);
        C5872yR c5872yR23 = new C5872yR("l.gs", enumC5746xR8, enumC5746xR9);
        EnumC5746xR enumC5746xR20 = EnumC5746xR.GET_AD_DICTIONARY_SDKCORE_START;
        C5872yR c5872yR24 = new C5872yR("l.jse", enumC5746xR9, enumC5746xR20);
        EnumC5746xR enumC5746xR21 = EnumC5746xR.GET_AD_DICTIONARY_SDKCORE_END;
        C5872yR c5872yR25 = new C5872yR("l.gad-js", enumC5746xR20, enumC5746xR21);
        EnumC5746xR enumC5746xR22 = EnumC5746xR.HTTP_RESPONSE_READY;
        C5872yR c5872yR26 = new C5872yR("l.http", enumC5746xR21, enumC5746xR22);
        EnumC5746xR enumC5746xR23 = EnumC5746xR.SCAR_PRELOADER_READY;
        C5872yR c5872yR27 = new C5872yR("l.slas.pre", enumC5746xR, enumC5746xR23);
        EnumC5746xR enumC5746xR24 = EnumC5746xR.SCAR_PRELOADER_PROCESSING_DONE;
        C5872yR c5872yR28 = new C5872yR("l.slas.prel.p", enumC5746xR23, enumC5746xR24);
        EnumC5746xR enumC5746xR25 = EnumC5746xR.NORMALIZATION_AD_RESPONSE_START;
        C5872yR c5872yR29 = new C5872yR("l.jse-nml", enumC5746xR22, enumC5746xR25);
        C5872yR c5872yR30 = new C5872yR("l.jse-nml", enumC5746xR24, enumC5746xR25);
        EnumC5746xR enumC5746xR26 = EnumC5746xR.NORMALIZATION_AD_RESPONSE_END;
        C5872yR c5872yR31 = new C5872yR("l.nml-js", enumC5746xR25, enumC5746xR26);
        EnumC5746xR enumC5746xR27 = EnumC5746xR.BINDER_CALL_START;
        C5872yR c5872yR32 = new C5872yR("l.nml-gmsg", enumC5746xR26, enumC5746xR27);
        EnumC5746xR enumC5746xR28 = EnumC5746xR.SERVER_RESPONSE_PARSE_START;
        C5872yR c5872yR33 = new C5872yR("l.nml-gmsg.s2s", enumC5746xR26, enumC5746xR28);
        C5872yR c5872yR34 = new C5872yR("l.binder", enumC5746xR27, enumC5746xR28);
        C5872yR c5872yR35 = new C5872yR("l.sr", enumC5746xR28, enumC5746xR12);
        C5872yR c5872yR36 = new C5872yR("l.render", enumC5746xR12, enumC5746xR2);
        C5872yR c5872yR37 = new C5872yR("l.t2", EnumC5746xR.RENDERING_ADSTRING_TYPE2_FETCH_START, EnumC5746xR.RENDERING_ADSTRING_TYPE2_FETCH_END);
        EnumC5746xR enumC5746xR29 = EnumC5746xR.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START;
        EnumC5746xR enumC5746xR30 = EnumC5746xR.RENDERING_NATIVE_ADS_PREPROCESS_START;
        C5872yR c5872yR38 = new C5872yR("l.render.na.js", enumC5746xR29, enumC5746xR30);
        C5872yR c5872yR39 = new C5872yR("l.render.na.prep", enumC5746xR30, EnumC5746xR.RENDERING_NATIVE_ADS_PREPROCESS_END);
        C5872yR c5872yR40 = new C5872yR("l.render.na.lna", EnumC5746xR.RENDERING_NATIVE_ASSETS_LOADING_START, EnumC5746xR.RENDERING_NATIVE_ASSETS_LOADING_END);
        C5872yR c5872yR41 = new C5872yR("l.render.wvc", enumC5746xR13, enumC5746xR14);
        C5872yR c5872yR42 = new C5872yR("l.render.acc", enumC5746xR14, enumC5746xR15);
        C5872yR c5872yR43 = new C5872yR("l.render.cfg-wv", enumC5746xR16, enumC5746xR17);
        C5872yR c5872yR44 = new C5872yR("l.render.pre", enumC5746xR12, enumC5746xR13);
        C5872yR c5872yR45 = new C5872yR("l.render.post", enumC5746xR19, enumC5746xR2);
        C5872yR c5872yR46 = new C5872yR("l.render.na.post", enumC5746xR17, enumC5746xR2);
        C5872yR c5872yR47 = new C5872yR("l.render.wvlh", enumC5746xR18, enumC5746xR19);
        C5872yR c5872yR48 = new C5872yR("l.na.b", EnumC5746xR.NATIVE_ASSETS_LOADING_BASIC_START, EnumC5746xR.NATIVE_ASSETS_LOADING_BASIC_END);
        C5872yR c5872yR49 = new C5872yR("l.na.im", EnumC5746xR.NATIVE_ASSETS_LOADING_IMAGE_START, EnumC5746xR.NATIVE_ASSETS_LOADING_IMAGE_END);
        C5872yR c5872yR50 = new C5872yR("l.na.imc", EnumC5746xR.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START, EnumC5746xR.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        C5872yR c5872yR51 = new C5872yR("l.na.l", EnumC5746xR.NATIVE_ASSETS_LOADING_LOGO_START, EnumC5746xR.NATIVE_ASSETS_LOADING_LOGO_END);
        C5872yR c5872yR52 = new C5872yR("l.na.ic", EnumC5746xR.NATIVE_ASSETS_LOADING_ICON_START, EnumC5746xR.NATIVE_ASSETS_LOADING_ICON_END);
        C5872yR c5872yR53 = new C5872yR("l.na.a", EnumC5746xR.NATIVE_ASSETS_LOADING_ATTRIBUTION_START, EnumC5746xR.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        EnumC5746xR enumC5746xR31 = EnumC5746xR.NATIVE_ASSETS_LOADING_VIDEO_START;
        EnumC5746xR enumC5746xR32 = EnumC5746xR.NATIVE_ASSETS_LOADING_VIDEO_END;
        f35352e = AbstractC5931yu0.s(c5872yR17, c5872yR18, c5872yR19, c5872yR20, c5872yR21, c5872yR22, c5872yR23, c5872yR24, c5872yR25, c5872yR26, c5872yR27, c5872yR28, c5872yR29, c5872yR30, c5872yR31, c5872yR32, c5872yR33, c5872yR34, c5872yR35, c5872yR36, c5872yR37, c5872yR38, c5872yR39, c5872yR40, c5872yR41, c5872yR42, c5872yR43, c5872yR44, c5872yR45, c5872yR46, c5872yR47, c5872yR48, c5872yR49, c5872yR50, c5872yR51, c5872yR52, c5872yR53, new C5872yR("l.na.v", enumC5746xR31, enumC5746xR32), new C5872yR("l.na.vc", EnumC5746xR.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START, enumC5746xR32), new C5872yR("l.na.m", EnumC5746xR.NATIVE_ASSETS_LOADING_MEDIA_START, EnumC5746xR.NATIVE_ASSETS_LOADING_MEDIA_END), new C5872yR("l.na.c", EnumC5746xR.NATIVE_ASSETS_LOADING_CUSTOM_START, EnumC5746xR.NATIVE_ASSETS_LOADING_CUSTOM_END), new C5872yR("l.na.o", EnumC5746xR.NATIVE_ASSETS_LOADING_OMID_START, EnumC5746xR.NATIVE_ASSETS_LOADING_OMID_END));
    }

    public C5872yR(String str, EnumC5746xR enumC5746xR, EnumC5746xR enumC5746xR2) {
        this.f35353a = str;
        this.f35354b = enumC5746xR;
        this.f35355c = enumC5746xR2;
    }

    public final String a() {
        return this.f35353a;
    }

    public final EnumC5746xR b() {
        return this.f35354b;
    }

    public final EnumC5746xR c() {
        return this.f35355c;
    }
}
