// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.storage.LocalUserArgs;
import com.pulumi.azurenative.storage.outputs.PermissionScopeResponse;
import com.pulumi.azurenative.storage.outputs.SshPublicKeyResponse;
import com.pulumi.azurenative.storage.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The local user associated with the storage accounts.
 * API Version: 2021-08-01.
 * 
 * ## Example Usage
 * ### CreateLocalUser
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.storage.LocalUser;
 * import com.pulumi.azurenative.storage.LocalUserArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var localUser = new LocalUser(&#34;localUser&#34;, LocalUserArgs.builder()        
 *             .accountName(&#34;sto2527&#34;)
 *             .hasSshPassword(true)
 *             .homeDirectory(&#34;homedirectory&#34;)
 *             .permissionScopes(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;permissions&#34;, &#34;rwd&#34;),
 *                     Map.entry(&#34;resourceName&#34;, &#34;share1&#34;),
 *                     Map.entry(&#34;service&#34;, &#34;file&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;permissions&#34;, &#34;rw&#34;),
 *                     Map.entry(&#34;resourceName&#34;, &#34;share2&#34;),
 *                     Map.entry(&#34;service&#34;, &#34;file&#34;)
 *                 ))
 *             .resourceGroupName(&#34;res6977&#34;)
 *             .sshAuthorizedKeys(Map.ofEntries(
 *                 Map.entry(&#34;description&#34;, &#34;key name&#34;),
 *                 Map.entry(&#34;key&#34;, &#34;ssh-rsa keykeykeykeykey=&#34;)
 *             ))
 *             .username(&#34;user1&#34;)
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * ### UpdateLocalUser
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.storage.LocalUser;
 * import com.pulumi.azurenative.storage.LocalUserArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var localUser = new LocalUser(&#34;localUser&#34;, LocalUserArgs.builder()        
 *             .accountName(&#34;sto2527&#34;)
 *             .hasSharedKey(false)
 *             .hasSshKey(false)
 *             .hasSshPassword(false)
 *             .homeDirectory(&#34;homedirectory2&#34;)
 *             .resourceGroupName(&#34;res6977&#34;)
 *             .username(&#34;user1&#34;)
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storage:LocalUser user1 /subscriptions/{subscription-id}/resourceGroups/res6977/providers/Microsoft.Storage/storageAccounts/sto2527/loalUsers/user1 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:LocalUser")
public class LocalUser extends com.pulumi.resources.CustomResource {
    /**
     * Indicates whether shared key exists. Set it to false to remove existing shared key.
     * 
     */
    @Export(name="hasSharedKey", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> hasSharedKey;

    /**
     * @return Indicates whether shared key exists. Set it to false to remove existing shared key.
     * 
     */
    public Output<Optional<Boolean>> hasSharedKey() {
        return Codegen.optional(this.hasSharedKey);
    }
    /**
     * Indicates whether ssh key exists. Set it to false to remove existing SSH key.
     * 
     */
    @Export(name="hasSshKey", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> hasSshKey;

    /**
     * @return Indicates whether ssh key exists. Set it to false to remove existing SSH key.
     * 
     */
    public Output<Optional<Boolean>> hasSshKey() {
        return Codegen.optional(this.hasSshKey);
    }
    /**
     * Indicates whether ssh password exists. Set it to false to remove existing SSH password.
     * 
     */
    @Export(name="hasSshPassword", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> hasSshPassword;

    /**
     * @return Indicates whether ssh password exists. Set it to false to remove existing SSH password.
     * 
     */
    public Output<Optional<Boolean>> hasSshPassword() {
        return Codegen.optional(this.hasSshPassword);
    }
    /**
     * Optional, local user home directory.
     * 
     */
    @Export(name="homeDirectory", type=String.class, parameters={})
    private Output</* @Nullable */ String> homeDirectory;

    /**
     * @return Optional, local user home directory.
     * 
     */
    public Output<Optional<String>> homeDirectory() {
        return Codegen.optional(this.homeDirectory);
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The permission scopes of the local user.
     * 
     */
    @Export(name="permissionScopes", type=List.class, parameters={PermissionScopeResponse.class})
    private Output</* @Nullable */ List<PermissionScopeResponse>> permissionScopes;

    /**
     * @return The permission scopes of the local user.
     * 
     */
    public Output<Optional<List<PermissionScopeResponse>>> permissionScopes() {
        return Codegen.optional(this.permissionScopes);
    }
    /**
     * A unique Security Identifier that is generated by the server.
     * 
     */
    @Export(name="sid", type=String.class, parameters={})
    private Output<String> sid;

    /**
     * @return A unique Security Identifier that is generated by the server.
     * 
     */
    public Output<String> sid() {
        return this.sid;
    }
    /**
     * Optional, local user ssh authorized keys for SFTP.
     * 
     */
    @Export(name="sshAuthorizedKeys", type=List.class, parameters={SshPublicKeyResponse.class})
    private Output</* @Nullable */ List<SshPublicKeyResponse>> sshAuthorizedKeys;

    /**
     * @return Optional, local user ssh authorized keys for SFTP.
     * 
     */
    public Output<Optional<List<SshPublicKeyResponse>>> sshAuthorizedKeys() {
        return Codegen.optional(this.sshAuthorizedKeys);
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LocalUser(String name) {
        this(name, LocalUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocalUser(String name, LocalUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocalUser(String name, LocalUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:LocalUser", name, args == null ? LocalUserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LocalUser(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:LocalUser", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storage/v20210801:LocalUser").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210901:LocalUser").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20220501:LocalUser").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LocalUser get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LocalUser(name, id, options);
    }
}
