// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.DisasterRecoveryConfigurationArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a disaster recovery configuration.
 * API Version: 2014-04-01.
 * 
 * ## Example Usage
 * ### Update a disaster recovery configuration
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.sql.DisasterRecoveryConfiguration;
 * import com.pulumi.azurenative.sql.DisasterRecoveryConfigurationArgs;
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
 *         var disasterRecoveryConfiguration = new DisasterRecoveryConfiguration(&#34;disasterRecoveryConfiguration&#34;, DisasterRecoveryConfigurationArgs.builder()        
 *             .disasterRecoveryConfigurationName(&#34;Default&#34;)
 *             .resourceGroupName(&#34;sqlcrudtest-4799&#34;)
 *             .serverName(&#34;sqlcrudtest-5961&#34;)
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
 * $ pulumi import azure-native:sql:DisasterRecoveryConfiguration Default /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-4799/providers/Microsoft.Sql/servers/sqlcrudtest-5961/databases/testdw/geoBackupPolicies/Default 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:DisasterRecoveryConfiguration")
public class DisasterRecoveryConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * Whether or not failover can be done automatically.
     * 
     */
    @Export(name="autoFailover", type=String.class, parameters={})
    private Output<String> autoFailover;

    /**
     * @return Whether or not failover can be done automatically.
     * 
     */
    public Output<String> autoFailover() {
        return this.autoFailover;
    }
    /**
     * How aggressive the automatic failover should be.
     * 
     */
    @Export(name="failoverPolicy", type=String.class, parameters={})
    private Output<String> failoverPolicy;

    /**
     * @return How aggressive the automatic failover should be.
     * 
     */
    public Output<String> failoverPolicy() {
        return this.failoverPolicy;
    }
    /**
     * Location of the server that contains this disaster recovery configuration.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the server that contains this disaster recovery configuration.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Logical name of the server.
     * 
     */
    @Export(name="logicalServerName", type=String.class, parameters={})
    private Output<String> logicalServerName;

    /**
     * @return Logical name of the server.
     * 
     */
    public Output<String> logicalServerName() {
        return this.logicalServerName;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Logical name of the partner server.
     * 
     */
    @Export(name="partnerLogicalServerName", type=String.class, parameters={})
    private Output<String> partnerLogicalServerName;

    /**
     * @return Logical name of the partner server.
     * 
     */
    public Output<String> partnerLogicalServerName() {
        return this.partnerLogicalServerName;
    }
    /**
     * Id of the partner server.
     * 
     */
    @Export(name="partnerServerId", type=String.class, parameters={})
    private Output<String> partnerServerId;

    /**
     * @return Id of the partner server.
     * 
     */
    public Output<String> partnerServerId() {
        return this.partnerServerId;
    }
    /**
     * The role of the current server in the disaster recovery configuration.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role of the current server in the disaster recovery configuration.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * The status of the disaster recovery configuration.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the disaster recovery configuration.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DisasterRecoveryConfiguration(String name) {
        this(name, DisasterRecoveryConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DisasterRecoveryConfiguration(String name, DisasterRecoveryConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DisasterRecoveryConfiguration(String name, DisasterRecoveryConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:DisasterRecoveryConfiguration", name, args == null ? DisasterRecoveryConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DisasterRecoveryConfiguration(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:DisasterRecoveryConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20140401:DisasterRecoveryConfiguration").build())
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
    public static DisasterRecoveryConfiguration get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DisasterRecoveryConfiguration(name, id, options);
    }
}