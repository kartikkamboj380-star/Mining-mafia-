package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
abstract class s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    static final BillingResult f12631A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    static final BillingResult f12632B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    static final BillingResult f12633C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    static final BillingResult f12634D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    static final BillingResult f12635E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    static final BillingResult f12636F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final BillingResult f12637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final BillingResult f12638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final BillingResult f12639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final BillingResult f12640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final BillingResult f12641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final BillingResult f12642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final BillingResult f12643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final BillingResult f12644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final BillingResult f12645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final BillingResult f12646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final BillingResult f12647k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final BillingResult f12648l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final BillingResult f12649m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final BillingResult f12650n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final BillingResult f12651o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final BillingResult f12652p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final BillingResult f12653q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final BillingResult f12654r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final BillingResult f12655s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final BillingResult f12656t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final BillingResult f12657u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final BillingResult f12658v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final BillingResult f12659w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final BillingResult f12660x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final BillingResult f12661y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final BillingResult f12662z;

    static {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(3);
        builderNewBuilder.setDebugMessage("Google Play In-app Billing API version is less than 3");
        f12637a = builderNewBuilder.build();
        BillingResult.Builder builderNewBuilder2 = BillingResult.newBuilder();
        builderNewBuilder2.setResponseCode(3);
        builderNewBuilder2.setDebugMessage("Google Play In-app Billing API version is less than 9");
        f12638b = builderNewBuilder2.build();
        BillingResult.Builder builderNewBuilder3 = BillingResult.newBuilder();
        builderNewBuilder3.setResponseCode(3);
        builderNewBuilder3.setDebugMessage("Billing service unavailable on device.");
        f12639c = builderNewBuilder3.build();
        BillingResult.Builder builderNewBuilder4 = BillingResult.newBuilder();
        builderNewBuilder4.setResponseCode(5);
        builderNewBuilder4.setDebugMessage("Client is already in the process of connecting to billing service.");
        f12640d = builderNewBuilder4.build();
        BillingResult.Builder builderNewBuilder5 = BillingResult.newBuilder();
        builderNewBuilder5.setResponseCode(5);
        builderNewBuilder5.setDebugMessage("The list of SKUs can't be empty.");
        f12641e = builderNewBuilder5.build();
        BillingResult.Builder builderNewBuilder6 = BillingResult.newBuilder();
        builderNewBuilder6.setResponseCode(5);
        builderNewBuilder6.setDebugMessage("SKU type can't be empty.");
        f12642f = builderNewBuilder6.build();
        BillingResult.Builder builderNewBuilder7 = BillingResult.newBuilder();
        builderNewBuilder7.setResponseCode(5);
        builderNewBuilder7.setDebugMessage("Product type can't be empty.");
        f12643g = builderNewBuilder7.build();
        BillingResult.Builder builderNewBuilder8 = BillingResult.newBuilder();
        builderNewBuilder8.setResponseCode(-2);
        builderNewBuilder8.setDebugMessage("Client does not support extra params.");
        f12644h = builderNewBuilder8.build();
        BillingResult.Builder builderNewBuilder9 = BillingResult.newBuilder();
        builderNewBuilder9.setResponseCode(5);
        builderNewBuilder9.setDebugMessage("Invalid purchase token.");
        f12645i = builderNewBuilder9.build();
        BillingResult.Builder builderNewBuilder10 = BillingResult.newBuilder();
        builderNewBuilder10.setResponseCode(6);
        builderNewBuilder10.setDebugMessage("An internal error occurred.");
        f12646j = builderNewBuilder10.build();
        BillingResult.Builder builderNewBuilder11 = BillingResult.newBuilder();
        builderNewBuilder11.setResponseCode(5);
        builderNewBuilder11.setDebugMessage("SKU can't be null.");
        f12647k = builderNewBuilder11.build();
        BillingResult.Builder builderNewBuilder12 = BillingResult.newBuilder();
        builderNewBuilder12.setResponseCode(0);
        f12648l = builderNewBuilder12.build();
        BillingResult.Builder builderNewBuilder13 = BillingResult.newBuilder();
        builderNewBuilder13.setResponseCode(-1);
        builderNewBuilder13.setDebugMessage("Service connection is disconnected.");
        f12649m = builderNewBuilder13.build();
        BillingResult.Builder builderNewBuilder14 = BillingResult.newBuilder();
        builderNewBuilder14.setResponseCode(2);
        builderNewBuilder14.setDebugMessage("Timeout communicating with service.");
        f12650n = builderNewBuilder14.build();
        BillingResult.Builder builderNewBuilder15 = BillingResult.newBuilder();
        builderNewBuilder15.setResponseCode(-2);
        builderNewBuilder15.setDebugMessage("Client does not support subscriptions.");
        f12651o = builderNewBuilder15.build();
        BillingResult.Builder builderNewBuilder16 = BillingResult.newBuilder();
        builderNewBuilder16.setResponseCode(-2);
        builderNewBuilder16.setDebugMessage("Client does not support subscriptions update.");
        f12652p = builderNewBuilder16.build();
        BillingResult.Builder builderNewBuilder17 = BillingResult.newBuilder();
        builderNewBuilder17.setResponseCode(-2);
        builderNewBuilder17.setDebugMessage("Client does not support get purchase history.");
        f12653q = builderNewBuilder17.build();
        BillingResult.Builder builderNewBuilder18 = BillingResult.newBuilder();
        builderNewBuilder18.setResponseCode(-2);
        builderNewBuilder18.setDebugMessage("Client does not support price change confirmation.");
        f12654r = builderNewBuilder18.build();
        BillingResult.Builder builderNewBuilder19 = BillingResult.newBuilder();
        builderNewBuilder19.setResponseCode(-2);
        builderNewBuilder19.setDebugMessage("Play Store version installed does not support cross selling products.");
        f12655s = builderNewBuilder19.build();
        BillingResult.Builder builderNewBuilder20 = BillingResult.newBuilder();
        builderNewBuilder20.setResponseCode(-2);
        builderNewBuilder20.setDebugMessage("Client does not support multi-item purchases.");
        f12656t = builderNewBuilder20.build();
        BillingResult.Builder builderNewBuilder21 = BillingResult.newBuilder();
        builderNewBuilder21.setResponseCode(-2);
        builderNewBuilder21.setDebugMessage("Client does not support offer_id_token.");
        f12657u = builderNewBuilder21.build();
        BillingResult.Builder builderNewBuilder22 = BillingResult.newBuilder();
        builderNewBuilder22.setResponseCode(-2);
        builderNewBuilder22.setDebugMessage("Client does not support ProductDetails.");
        f12658v = builderNewBuilder22.build();
        BillingResult.Builder builderNewBuilder23 = BillingResult.newBuilder();
        builderNewBuilder23.setResponseCode(-2);
        builderNewBuilder23.setDebugMessage("Client does not support in-app messages.");
        f12659w = builderNewBuilder23.build();
        BillingResult.Builder builderNewBuilder24 = BillingResult.newBuilder();
        builderNewBuilder24.setResponseCode(-2);
        builderNewBuilder24.setDebugMessage("Client does not support user choice billing.");
        f12660x = builderNewBuilder24.build();
        BillingResult.Builder builderNewBuilder25 = BillingResult.newBuilder();
        builderNewBuilder25.setResponseCode(-2);
        builderNewBuilder25.setDebugMessage("Play Store version installed does not support external offer.");
        f12661y = builderNewBuilder25.build();
        BillingResult.Builder builderNewBuilder26 = BillingResult.newBuilder();
        builderNewBuilder26.setResponseCode(5);
        builderNewBuilder26.setDebugMessage("Unknown feature");
        f12662z = builderNewBuilder26.build();
        BillingResult.Builder builderNewBuilder27 = BillingResult.newBuilder();
        builderNewBuilder27.setResponseCode(-2);
        builderNewBuilder27.setDebugMessage("Play Store version installed does not support get billing config.");
        f12631A = builderNewBuilder27.build();
        BillingResult.Builder builderNewBuilder28 = BillingResult.newBuilder();
        builderNewBuilder28.setResponseCode(-2);
        builderNewBuilder28.setDebugMessage("Query product details with serialized docid is not supported.");
        f12632B = builderNewBuilder28.build();
        BillingResult.Builder builderNewBuilder29 = BillingResult.newBuilder();
        builderNewBuilder29.setResponseCode(4);
        builderNewBuilder29.setDebugMessage("Item is unavailable for purchase.");
        f12633C = builderNewBuilder29.build();
        BillingResult.Builder builderNewBuilder30 = BillingResult.newBuilder();
        builderNewBuilder30.setResponseCode(-2);
        builderNewBuilder30.setDebugMessage("Query product details with developer specified account is not supported.");
        f12634D = builderNewBuilder30.build();
        BillingResult.Builder builderNewBuilder31 = BillingResult.newBuilder();
        builderNewBuilder31.setResponseCode(-2);
        builderNewBuilder31.setDebugMessage("Play Store version installed does not support alternative billing only.");
        f12635E = builderNewBuilder31.build();
        BillingResult.Builder builderNewBuilder32 = BillingResult.newBuilder();
        builderNewBuilder32.setResponseCode(5);
        builderNewBuilder32.setDebugMessage("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        f12636F = builderNewBuilder32.build();
    }

    static BillingResult a(int i10, String str) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i10);
        builderNewBuilder.setDebugMessage(str);
        return builderNewBuilder.build();
    }
}
