// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.DistributedAvailabilityGroupArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Distributed availability group between box and Sql Managed Instance.
 * API Version: 2021-05-01-preview.
 * 
 * ## Example Usage
 * ### Create a distributed availability group.
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.sql.DistributedAvailabilityGroup;
 * import com.pulumi.azurenative.sql.DistributedAvailabilityGroupArgs;
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
 *         var distributedAvailabilityGroup = new DistributedAvailabilityGroup(&#34;distributedAvailabilityGroup&#34;, DistributedAvailabilityGroupArgs.builder()        
 *             .distributedAvailabilityGroupName(&#34;dag&#34;)
 *             .managedInstanceName(&#34;testcl&#34;)
 *             .primaryAvailabilityGroupName(&#34;BoxLocalAg1&#34;)
 *             .resourceGroupName(&#34;testrg&#34;)
 *             .secondaryAvailabilityGroupName(&#34;testcl&#34;)
 *             .sourceEndpoint(&#34;TCP://SERVER:7022&#34;)
 *             .targetDatabase(&#34;testdb&#34;)
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
 * $ pulumi import azure-native:sql:DistributedAvailabilityGroup dag /subscriptions/f2669dff-5f08-45dd-b857-b2a60b72cdc9/resourceGroups/testrg/providers/Microsoft.Sql/managedInstances/testcl/distributedAvailabilityGroups/dag 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:DistributedAvailabilityGroup")
public class DistributedAvailabilityGroup extends com.pulumi.resources.CustomResource {
    /**
     * The distributed availability group id
     * 
     */
    @Export(name="distributedAvailabilityGroupId", type=String.class, parameters={})
    private Output<String> distributedAvailabilityGroupId;

    /**
     * @return The distributed availability group id
     * 
     */
    public Output<String> distributedAvailabilityGroupId() {
        return this.distributedAvailabilityGroupId;
    }
    /**
     * The last hardened lsn
     * 
     */
    @Export(name="lastHardenedLsn", type=String.class, parameters={})
    private Output<String> lastHardenedLsn;

    /**
     * @return The last hardened lsn
     * 
     */
    public Output<String> lastHardenedLsn() {
        return this.lastHardenedLsn;
    }
    /**
     * The link state
     * 
     */
    @Export(name="linkState", type=String.class, parameters={})
    private Output<String> linkState;

    /**
     * @return The link state
     * 
     */
    public Output<String> linkState() {
        return this.linkState;
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
     * The primary availability group name
     * 
     */
    @Export(name="primaryAvailabilityGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> primaryAvailabilityGroupName;

    /**
     * @return The primary availability group name
     * 
     */
    public Output<Optional<String>> primaryAvailabilityGroupName() {
        return Codegen.optional(this.primaryAvailabilityGroupName);
    }
    /**
     * The replication mode of a distributed availability group. Parameter will be ignored during link creation.
     * 
     */
    @Export(name="replicationMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> replicationMode;

    /**
     * @return The replication mode of a distributed availability group. Parameter will be ignored during link creation.
     * 
     */
    public Output<Optional<String>> replicationMode() {
        return Codegen.optional(this.replicationMode);
    }
    /**
     * The secondary availability group name
     * 
     */
    @Export(name="secondaryAvailabilityGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> secondaryAvailabilityGroupName;

    /**
     * @return The secondary availability group name
     * 
     */
    public Output<Optional<String>> secondaryAvailabilityGroupName() {
        return Codegen.optional(this.secondaryAvailabilityGroupName);
    }
    /**
     * The source endpoint
     * 
     */
    @Export(name="sourceEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceEndpoint;

    /**
     * @return The source endpoint
     * 
     */
    public Output<Optional<String>> sourceEndpoint() {
        return Codegen.optional(this.sourceEndpoint);
    }
    /**
     * The source replica id
     * 
     */
    @Export(name="sourceReplicaId", type=String.class, parameters={})
    private Output<String> sourceReplicaId;

    /**
     * @return The source replica id
     * 
     */
    public Output<String> sourceReplicaId() {
        return this.sourceReplicaId;
    }
    /**
     * The name of the target database
     * 
     */
    @Export(name="targetDatabase", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetDatabase;

    /**
     * @return The name of the target database
     * 
     */
    public Output<Optional<String>> targetDatabase() {
        return Codegen.optional(this.targetDatabase);
    }
    /**
     * The target replica id
     * 
     */
    @Export(name="targetReplicaId", type=String.class, parameters={})
    private Output<String> targetReplicaId;

    /**
     * @return The target replica id
     * 
     */
    public Output<String> targetReplicaId() {
        return this.targetReplicaId;
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
    public DistributedAvailabilityGroup(String name) {
        this(name, DistributedAvailabilityGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DistributedAvailabilityGroup(String name, DistributedAvailabilityGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DistributedAvailabilityGroup(String name, DistributedAvailabilityGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:DistributedAvailabilityGroup", name, args == null ? DistributedAvailabilityGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DistributedAvailabilityGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:DistributedAvailabilityGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:DistributedAvailabilityGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:DistributedAvailabilityGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101:DistributedAvailabilityGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101preview:DistributedAvailabilityGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20220201preview:DistributedAvailabilityGroup").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20220501preview:DistributedAvailabilityGroup").build())
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
    public static DistributedAvailabilityGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DistributedAvailabilityGroup(name, id, options);
    }
}